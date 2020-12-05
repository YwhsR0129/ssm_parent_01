package com.zw;

import com.zw.pojo.Items;
import com.zw.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zw
 * @Data: Created in 19:41 2020/11/17
 * @Blogs: https://www.cnblogs.com/YwhsR0129/
 */
public class serviceTest {
    @Test
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService) applicationContext.getBean("itemsServiceImpl");

        Items items = new Items();
        items.setName("测试事务");
        itemsService.save(items);
    }
}
