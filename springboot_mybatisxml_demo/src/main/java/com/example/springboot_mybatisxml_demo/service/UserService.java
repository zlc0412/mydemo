package com.example.springboot_mybatisxml_demo.service;

import com.example.springboot_mybatisxml_demo.dao.UserDao;
import com.example.springboot_mybatisxml_demo.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll(){
        return userDao.findAll();
    }
}
