package com.lutingting.springcloud.order.controller;

import com.lutingting.springcloud.order.feign.UserFeignService;
import com.lutingting.springcloud.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/")
public class OrderController {
    @Qualifier("")
    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("getOrderById")
    public Object getOrderById(@RequestParam("id") Integer id){
        Order order = new Order();
        order.setId(1);
        order.setOrderNo("2020032200001");
        order.setUserId(1);
        String username = userFeignService.getUserNameById(1);
        order.setUsername(username);
        return order;
    }
}
