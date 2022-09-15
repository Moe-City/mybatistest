package com.mybatistest.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface sstMapper {
    int deleteAUser(@Param("id") Integer id);
}
