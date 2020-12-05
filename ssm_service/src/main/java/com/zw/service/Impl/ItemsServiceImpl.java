package com.zw.service.Impl;

import com.zw.dao.ItemsDao;
import com.zw.pojo.Items;
import com.zw.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zw
 * @Data: Created in 19:37 2020/11/17
 * @Blogs: https://www.cnblogs.com/YwhsR0129/
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    /***
     * 集合查询
     * @return
     */
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    /***
     * 增加商品测试事务
     * @param items
     * @return
     */
    public int save(Items items) {
        int acount = itemsDao.save(items);

        System.out.println("acount:"+acount);

        //测试事务，如果出错，是否回滚
        //int q=10/0;

        return acount;
    }
}
