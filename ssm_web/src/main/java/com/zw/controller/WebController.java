package com.zw.controller;

import com.zw.pojo.Items;
import com.zw.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: zw
 * @Data: Created in 20:11 2020/11/17
 * @Blogs: https://www.cnblogs.com/YwhsR0129/
 */
@Controller
@RequestMapping(value = "/items")
public class WebController {

    @Autowired
    private ItemsService itemsService;

    /**
     * 列表访问
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(Model model){
        //集合查询
        List<Items> items = itemsService.findAll();
        //存入回显
        model.addAttribute("items",items);
        return "items";
    }

    /***
     * 事务测试
     * 增加商品
     * @return
     */
    @RequestMapping(value = "/save")
    public String save(Items items){
        int acount =  itemsService.save(items);
        //集合列表页跳转
        System.out.println(acount);
        return "redirect:/items/list";
    }

}