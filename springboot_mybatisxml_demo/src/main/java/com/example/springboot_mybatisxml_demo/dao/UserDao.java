package com.example.springboot_mybatisxml_demo.dao;

import com.example.springboot_mybatisxml_demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    public List<User> findAll();
}
