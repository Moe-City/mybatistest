package com.mybatistest.controller.day5.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    @Qualifier("UserBeanDay5")
//    @Resource(name = "UserBeanDay5")
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public int addUser(){
        UserDao userDao = new UserDaoImpl();
        return userDao.addUser(this.user);
    }
}
