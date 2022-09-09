package com.mybatistest.controller.day4;

import com.mybatistest.controller.day4.mission.Conversation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.log4j.Logger;

public class classtest {

    private static Logger logger = Logger.getLogger(classtest.class);
    //IOC
    public static void main(String[] args){
        logger.info("练习1,2");
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        Conversation c = (Conversation)ac.getBean("conversation1") ;
        System.out.println(c.showConversation());
        c = (Conversation)ac.getBean("conversation2") ;
        System.out.println(c.showConversation());
        System.out.println("======================================================");
        Print print = (Print) ac.getBean("print1");
        System.out.println(print.showInfo());
        print = (Print) ac.getBean("print2");
        System.out.println(print.showInfo());
    }


}
