package com.mybatistest.controller.day3;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.Provider;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test6 {
    public static void main(String[] args) {
    SqlSession sqlSession = MybatisUtil.open();
    ProviderMapper providerMapper = sqlSession.getMapper(ProviderMapper.class);
    Map map = new HashMap();
    map.put("proCode","BJ");
    int[] ids = {1,6,12};
    map.put("ids",ids);
    List<Provider> list = providerMapper.selectALlBillByCodeAndIds(map);
    list.forEach(provider -> System.out.println(provider.toString2()));
    sqlSession.close();
    }
}
