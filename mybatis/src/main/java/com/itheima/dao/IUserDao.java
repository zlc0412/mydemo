package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
