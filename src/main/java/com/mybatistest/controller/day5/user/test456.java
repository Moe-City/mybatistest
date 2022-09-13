package com.mybatistest.controller.day5.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test456 {
    public static void main(String[] args){
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserService userService = ac.getBean(UserServiceImpl.class);//test 4, 5
        UserService userService = (UserService) ac.getBean("userServiceImpl");//test 4, 5, 6
        System.out.println(userService.getUser());
        System.out.println(userService.addUser());
    }
}
