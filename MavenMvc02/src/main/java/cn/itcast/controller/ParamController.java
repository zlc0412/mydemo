package cn.itcast.controller;

import cn.itcast.doman.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther zlc
 * @date 2019-05-23 16:08
 * @description 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {


    @RequestMapping("/testParam")
    public String testParam(String username,String password){

        System.out.println("执行了----");
        System.out.println(username);
        System.out.println(password);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String testParam(Account account){
        System.out.println("执行了----");
        System.out.println(account);
        return "success";
    }
}
