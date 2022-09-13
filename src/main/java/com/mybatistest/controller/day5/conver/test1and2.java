package com.mybatistest.controller.day5.conver;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1and2 {
    private static Logger logger = Logger.getLogger(test1and2.class);
    //IOC
    public static void main(String[] args) {
        logger.info("练习1 构造注入");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Conversation c = (Conversation) ac.getBean("con1");
        System.out.println(c.showConversation());
        c = (ConversationServiceImpl) ac.getBean("con2");
        System.out.println(c.showConversation());
        System.out.println("======================================================");
        logger.info("p命名空间");
        c = (ConversationServiceImpl) ac.getBean("con3");
        System.out.println(c.showConversation());
        c = (ConversationServiceImpl) ac.getBean("con4");
        System.out.println(c.showConversation());
    }
}
