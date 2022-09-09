package com.mybatistest.controller.day4.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args){
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        userDao userDao1 = (userDao) ac.getBean("user");
        userDao1.setUsername("ABC");
        /*userService service = (userService) ac.getBean("user");
        userDao dao = new userDao();
        dao.setUsername("ABC");
        service.setUserDao(dao);
        service.getUserInfo();*/
    }
}
