package com.mybatistest.controller.day3;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.Provider;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class test2 {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.open();
        ProviderMapper providerMapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = new Provider();
        provider.setProName("北京");
        List<Provider> list = providerMapper.dynamicSelect(provider);
        System.out.println(list.toString());
        System.out.println("===============================");
        provider = new Provider();
        provider.setProCode("GZ");
        list = providerMapper.dynamicSelect(provider);
        System.out.println(list.toString());
    }
}
