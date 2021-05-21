package com.lc.controller;


import com.lc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

public class HelloController {

    @GetMapping("/hello")

    public String hello(){
        return "hello swagger";
    }

    @PostMapping("/getUser")

    public User getUser(String username,String password){
//        username="liucaho";
//        password="123456";

        return new User(username,password);
    }
//    public String getUser(String username,String password){
//        return new User(username,password).toString();
//    }

    @DeleteMapping("/delete/user")
    public String deleteUser(){
        return "用户delete";
    }

    @PutMapping("/put/user")
    public String updateUser(){
        return "用户update";
    }

    @GetMapping("/get/user")
    public String findUser(){
        return "用户find";
    }
}
