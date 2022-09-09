package com.mybatistest.controller.day4.AOP;

import com.mybatistest.controller.day4.classtest;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
public class UserLoggerAop {
    private Logger logger = Logger.getLogger(UserLoggerAop .class);
    public void before(JoinPoint jp){
       logger.info("前置增强,目标："+jp.getTarget()+" . "+jp.getSignature().getName());
    }
    public void after(JoinPoint jp){
        logger.info("后置增强,目标："+jp.getTarget()+" . "+jp.getSignature().getName());
    }
}
