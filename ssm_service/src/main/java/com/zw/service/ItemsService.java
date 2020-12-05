package com.zw.service;

import com.zw.pojo.Items;

import java.util.List;

/**
 * @Author: zw
 * @Data: Created in 19:36 2020/11/17
 * @Blogs: https://www.cnblogs.com/YwhsR0129/
 */
public interface ItemsService {
    /***
     * 列表查询
     * @return
     */
    List<Items> findAll();

    /***
     * 增加商品
     * @param items
     * @return
     */
    int save(Items items);
}
