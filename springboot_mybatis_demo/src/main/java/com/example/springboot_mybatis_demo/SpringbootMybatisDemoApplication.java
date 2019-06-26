package com.example.springboot_mybatis_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.springboot_mybatis_demo.mapper")
@SpringBootApplication
public class SpringbootMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
    }

}
