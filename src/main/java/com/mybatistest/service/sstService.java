package com.mybatistest.service;

import org.apache.ibatis.annotations.Param;

public interface sstService {
    int deleteAUser(@Param("id") Integer id);
}
