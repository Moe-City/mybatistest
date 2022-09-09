package com.mybatistest.controller.day3;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.Provider;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class test3and4 {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.open();
        ProviderMapper providerMapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = new Provider();
        provider.setId(16);
        provider.setProCode("BZ_BZ5999");
        try {
            if (providerMapper.dynamicUpdate(provider) == 1){
                System.out.println("SUCCESS");
                sqlSession.commit();
                System.out.println(providerMapper.getProviderByid(16));
            }else {
                System.out.println("FAILED");
            }
        }catch (Exception e){
            System.out.println(e);
            sqlSession.rollback();
        }
        System.out.println("================================");
        provider.setProName("广州市九月不摆有限公司");
        provider.setProCode(null);
        try {
            if (providerMapper.dynamicUpdateTrim(provider) == 1){
                System.out.println("success");
                sqlSession.commit();
                System.out.println(providerMapper.getProviderByid(16));
            }else{
                System.out.println("failed");
            }
        }catch (Exception e){
            System.out.println(e);
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
    }
}
