package com.mybatistest.controller.day2;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.Provider;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

public class test3 {
    public static void main(String[] args){
        SqlSession sqlSession = MybatisUtil.open();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        //mapper.modifyNameByParam("proNameName",18);
        Provider provider = new Provider();
        provider.setId(18);
        provider.setProName("proNameNameName");
        provider.setModifyBy(1);
        provider.setModifyDate(new Date());
        System.out.println(mapper.modifyProvider(provider));
        System.out.println(mapper.getProviderByid(18));
        sqlSession.close();
    }
}
