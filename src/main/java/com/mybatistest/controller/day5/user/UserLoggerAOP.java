package com.mybatistest.controller.day5.user;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class UserLoggerAOP {
//    @Pointcut(value = "execution(* com.mybatistest.controller.day5.user.*.*(..))")
@Pointcut(value = "execution(* com.mybatistest.controller.day5.user.UserServiceImpl.*(..))")
    public void myPointCut(){}
    private Logger logger = Logger.getLogger(UserLoggerAOP.class);
    @Before(value = "myPointCut()")
    public void before(JoinPoint jp){
        logger.info("前置增强,目标："+jp.getTarget()+" . "+jp.getSignature().getName());
    }
    @After(value = "myPointCut()")
    public void after(JoinPoint jp){
        logger.info("后置增强,目标："+jp.getTarget()+" . "+jp.getSignature().getName());
    }
}
