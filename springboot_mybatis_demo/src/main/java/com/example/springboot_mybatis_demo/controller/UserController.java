package com.example.springboot_mybatis_demo.controller;

import com.example.springboot_mybatis_demo.entity.User;
import com.example.springboot_mybatis_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findById/{id}")
    public String findById (@PathVariable int id){
        User user = userService.findById(id);
        return user.toString();

    }
    @RequestMapping("/findAll")
    public String findAll(){
        List<User> users = userService.findAll();
        return users.toString();
    }

    @RequestMapping("/saveUser")
    public String saveUser(){
        User user = new User();
        user.setName("jialiang");
        user.setAddress("中国");
        userService.saveUser(user);
        return "success";
    }

    @RequestMapping("/updateUser")
    public String updateUser(){
        User user = new User();
        user.setId(1);
        user.setName("更新1");
        user.setAddress("更新中国");
        userService.updateUser(user);
        return "success_update";
    }

    @RequestMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return "success_delete";
    }
}
