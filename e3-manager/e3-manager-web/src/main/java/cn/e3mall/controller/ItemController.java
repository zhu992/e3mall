package cn.e3mall.controller;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zwy on 2019/7/13.
 */
@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    @RequestMapping("/item/{id}")
    public TbItem getItem(@PathVariable("id") Long id) {
        //查询商品详情
        return itemService.getItemById(id);
    }
}
