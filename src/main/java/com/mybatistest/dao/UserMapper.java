package com.mybatistest.dao;

import com.mybatistest.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface UserMapper {
    int modifyUserName(@Param("userName")String userName, @Param("id")int id);
    int modifyUserPassword(@Param("userPassword")String userPassword, @Param("id")int id);
    int deleteAUser(@Param("id") Integer id);
}
