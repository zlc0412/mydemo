package com.example.springboot_mybatisxml_demo.controller;

import com.example.springboot_mybatisxml_demo.entity.User;
import com.example.springboot_mybatisxml_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/findAll")
    public String findAll(){
        List<User> users = userService.findAll();
        return users.toString();
    }

}
