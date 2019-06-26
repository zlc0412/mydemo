package com.example.springboot_mybatisxml_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.springboot_mybatisxml_demo.dao")
@SpringBootApplication
public class SpringbootMybatisxmlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisxmlDemoApplication.class, args);
    }

}
