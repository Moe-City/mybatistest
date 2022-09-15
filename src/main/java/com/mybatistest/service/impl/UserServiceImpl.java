package com.mybatistest.service.impl;

import com.mybatistest.dao.UserMapper;
import com.mybatistest.pojo.User;
import com.mybatistest.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("um2")
    private UserMapper userMapper;

    @Override
    public int modifyUserName(@Param("userName")String userName, @Param("id")int id) {
        return userMapper.modifyUserName(userName, id);
    }

    @Override
    public int modifyUserPassword(@Param("userPassword")String userPassword, @Param("id")int id) {
        return userMapper.modifyUserPassword(userPassword, id);
    }

    @Override
    public int deleteAUser(int id) {
        return userMapper.deleteAUser(id);
    }
}
