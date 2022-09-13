package com.mybatistest.controller.day5.user;

public class UserDaoImpl implements UserDao{
    @Override
    public int addUser(User user) {
        if (user != null && user.getUsername().length()>0)
            return 1;
        else
            return 0;
    }
}
