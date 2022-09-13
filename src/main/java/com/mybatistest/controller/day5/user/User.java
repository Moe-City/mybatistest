package com.mybatistest.controller.day5.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("UserBeanDay5")
public class User {
    @Value("user456")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
