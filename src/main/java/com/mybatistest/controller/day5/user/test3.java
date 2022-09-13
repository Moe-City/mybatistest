package com.mybatistest.controller.day5.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {
    public static void main(String[] args){
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)ac.getBean("addUser");//test 3 applicationContext.xml 取消注释
        //userService.setUser("user");//temp test
        System.out.println(userService.getUser());
        System.out.println(userService.addUser());
    }
}
