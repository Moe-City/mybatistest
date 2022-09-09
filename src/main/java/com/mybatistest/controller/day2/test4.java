package com.mybatistest.controller.day2;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.Provider;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class test4 {
    public static void main(String[] args){
        SqlSession sqlSession = MybatisUtil.open();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        try {
            System.out.println(mapper.delete1ProviderByid(18));
            sqlSession.commit();
            List<Provider> list = mapper.selectAllProvider();
            System.out.println(list.toString());
        }catch (Exception e){
            System.out.println("ERROR\n"+e);
        }finally {
            sqlSession.close();
        }
    }
}
