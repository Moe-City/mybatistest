package com.mybatistest.service.impl;

import com.mybatistest.service.sstService;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("sstService")
public class sstServiceImpl implements sstService {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int deleteAUser(@Param("id") Integer id) {
        return sqlSessionTemplate.delete("com.mybatistest.dao.sstMapper.deleteAUser",id);
    }
}
