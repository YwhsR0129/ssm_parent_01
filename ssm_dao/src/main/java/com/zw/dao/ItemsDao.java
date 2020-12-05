package com.zw.dao;


import com.zw.pojo.Items;

import java.util.List;

/**
 * @Author: zw
 * @Data: Created in 18:23 2020/11/17
 * @Blogs: https://www.cnblogs.com/YwhsR0129/
 */
public interface ItemsDao {
    /***
     * 查询所有
     * @return
     */
    List<Items> findAll();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);
}
