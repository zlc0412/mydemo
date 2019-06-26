package com.example.springboot_mybatis_demo.service;

import com.example.springboot_mybatis_demo.entity.User;
import com.example.springboot_mybatis_demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User findById(int id) {
        return userMapper.findById(id);
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }

    public void saveUser(User user){
        userMapper.saveUser(user);
    }

    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    public void deleteUser(int id){
        userMapper.delete(id);
    }
}
