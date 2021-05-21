package com.lc.buy;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@ResponseBody
public class Buygoods {

    @GetMapping("/addGoods")
    @ResponseBody
    public String add(String name,String nameId,Integer count){
        return "增加的商品为"+name+"增加的商品编号"+nameId+"增加的商品数量为"+count;
    }

    @DeleteMapping("/delete/goods")
    public String delete(String goodsName){

        return "商品delete";
    }

    @PutMapping("/update/goodsName")
    @ResponseBody
    public String update(String goodsName,Integer goodsId){
        return "update";
    }


    @GetMapping("/find/goods")
    public List findGoodsName(){

        ModelAndView mv=new ModelAndView();
        return new ArrayList();
    }
}
