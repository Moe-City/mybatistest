package com.mybatistest.controller.day3;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.Provider;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class classtest {
    public static void main(String[] args){
        SqlSession sqlSession = MybatisUtil.open();
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        //Provider provider = new Provider();
        //provider.setId(16);
        //provider.setProName("广州");
        //List<Provider> list = mapper.dynamicSelect(provider);
//        System.out.println(list.toString());
        int[] ids = {1,2,4};
        List<Provider> list2 = mapper.selectByIds(ids);System.out.println(list2.toString());
        sqlSession.close();
    }
}
