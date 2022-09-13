package com.mybatistest.controller.day4.AOP;

import org.apache.log4j.Logger;

public class userService {//useless, waiting to be satisfied

    private static Logger logger = Logger.getLogger(userService.class);

    private userDao userdao;

    public com.mybatistest.controller.day4.AOP.userDao getUserDao() {
        return userdao;
    }

    public void setUserDao(com.mybatistest.controller.day4.AOP.userDao userDao) {
        this.userdao = userDao;
    }

    public String getUserInfo(){
        logger.info("UserService");
        String userInfo = this.userdao.getUsername();
        logger.debug("userInfo");
        return userInfo;
    }
}
