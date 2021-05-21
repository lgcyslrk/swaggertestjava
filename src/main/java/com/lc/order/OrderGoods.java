package com.lc.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
public class OrderGoods {

    @PostMapping("/add/order")
    public String addOrder(String orderId,String orderName,Integer account){

        return "订单编号"+orderId+"订单名称"+orderName+"订单数量"+account;
    }


    @DeleteMapping("/delete/order")
    public String delete(String orderId){

        return orderId;
    }
    @PutMapping("/update/ordersName")
    public String update(String orderName){
        return "修改订单";
    }


    @GetMapping("/find/order")
    public List findOrdersName(){

        return new ArrayList();
    }
}
