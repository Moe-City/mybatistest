package com.mybatistest.service;

import com.mybatistest.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    int modifyUserName(@Param("userName")String userName, @Param("id")int id);
    int modifyUserPassword(@Param("userPassword")String userPassword, @Param("id")int id);
    int deleteAUser(int id);
}
