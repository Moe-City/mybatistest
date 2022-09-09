package com.mybatistest.controller.day2;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.Provider;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class test5 {
    public static void main(String[] args){
        SqlSession sqlSession = MybatisUtil.open();
        ProviderMapper providerMapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = providerMapper.selectAllBillByProviderid(2);
        System.out.println(provider.toString2());
    }
}
