package com.mybatistest.controller.day3;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.Provider;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.LinkedList;
import java.util.List;

public class test5 {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtil.open();
        ProviderMapper providerMapper = sqlSession.getMapper(ProviderMapper.class);
        int[] ids = {6,7,13,14};
        List<Provider> list = providerMapper.selectAllBillByIds(ids);//以数组作为参数
        list.forEach(provider -> System.out.println(provider.toString2()));
        System.out.println("================================================");
        List<Integer> integerList = new LinkedList<>();//以List作为foreach的参数
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        list.clear();
        list = providerMapper.selectAllBillByListIds(integerList);
        list.forEach(provider -> System.out.println(provider.toString2()));
        sqlSession.close();
    }
}
