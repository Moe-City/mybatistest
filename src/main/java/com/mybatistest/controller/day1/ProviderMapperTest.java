package com.mybatistest.controller.day1;

import com.mybatistest.pojo.Provider;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ProviderMapperTest {
    public static void main(String[] args){
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Provider> list = sqlSession.selectList("com.mybatistest.dao.ProviderMapper.selectAllProvider");
        System.out.println("共有 "+list.size()+" 条记录");
        sqlSession.close();
    }
}
