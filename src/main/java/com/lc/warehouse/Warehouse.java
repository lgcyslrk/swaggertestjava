package com.lc.warehouse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class Warehouse {

    @PostMapping("/addWareHouse")
    public  String addWareHouse(){
         return "增加仓库";
    }

    @DeleteMapping("/delete/WareHouse")
    public String deleteWareHouse(){
        return "减少仓库";
    }

    @PutMapping("/update/WareHouse")
    public String updateWareHouse(){
        return "更新仓库";
    }

    @GetMapping("/findWareHouse")
    public String findWareHouse(){
        return "查找仓库";
    }
}
