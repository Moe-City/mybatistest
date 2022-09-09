package com.mybatistest.controller.day4.AOP;

public class userDao {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "userDao{" +
                "username='" + username + '\'' +
                '}';
    }
}
