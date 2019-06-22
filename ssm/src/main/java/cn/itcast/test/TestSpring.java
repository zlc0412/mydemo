package cn.itcast.test;

import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther zlc
 * @date 2019-05-30 14:43
 * @description TODO
 */
public class TestSpring {
    @Test
    public void run(){
//        用SqlMapConfig.xml配置文件的测试方法
        ApplicationContext ac= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountService accountService = (AccountService) ac.getBean("accountService");

        accountService.findAll();


    }
}
