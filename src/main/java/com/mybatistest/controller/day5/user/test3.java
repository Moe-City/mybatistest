package com.mybatistest.controller.day5.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.log4j.Logger;

public class test3 {
    private static Logger logger = Logger.getLogger(test3.class);
    public static void main(String[] args){
        logger.debug("123");
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)ac.getBean("addUser");//test 3 applicationContext.xml 取消注释
        //userService.setUser("user");//temp test
        System.out.println(userService.getUser());
        System.out.println(userService.addUser());
    }
}
