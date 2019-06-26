package com.example.springboot_mybatis_demo.mapper;

import com.example.springboot_mybatis_demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(int id);

    @Select("SELECT * FROM user")
    List<User> findAll();

    @Insert("insert into user (name,address)values(#{name},#{address})")
    void saveUser(User user);

    @Update("update user set name=#{name},address=#{address} where id=#{id}")
    void updateUser(User user);

    @Delete("delete from user where id = #{id}")
    void delete(int id);

}
