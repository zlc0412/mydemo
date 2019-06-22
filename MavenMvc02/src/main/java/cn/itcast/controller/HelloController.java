package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther zlc
 * @date 2019-05-22 16:35
 * @description 控制器，用来接收请求
 */
@Controller
@RequestMapping(path = "/user")
public class HelloController {

    //请求映射，请求映射到一个方法。
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello stringMvc");
        return "success";
    }

    //测试RequestMapping
    @RequestMapping(path = "/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("测试RequestMapping");
        return "success";
    }

}
