package com.mybatistest.controller.day2;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.Provider;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;

public class test2 {
    public static void main(String[] args){
        SqlSession sqlSession = MybatisUtil.open();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider = new Provider();
        provider.setId(18);
        provider.setProCode("proCode");
        provider.setProName("proName");
        provider.setProDesc("proDesc");
        provider.setProContact("proContact");
        provider.setProPhone("proPhone");
        provider.setProAddress("proAddress");
        provider.setProFax("proFax");
        provider.setCreatedBy(1);
        provider.setCreationDate(new Date());
        try {
            if (mapper.add1Provider(provider) == 1){
                sqlSession.commit();
                System.out.println("SUCCESS");
            }else {
                System.out.println("FAILED");
            }
            System.out.println(mapper.getProviderByid(18).toString());
        }catch (Exception e){
            sqlSession.rollback();
            System.out.println("ERROR\n"+ e);
        }finally {
            sqlSession.close();
        }

    }
}
