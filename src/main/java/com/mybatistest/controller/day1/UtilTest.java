package com.mybatistest.controller.day1;

import com.mybatistest.dao.BillMapper;
import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.Bill;
import com.mybatistest.pojo.Provider;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilTest {
    public static void main (String[] args){
        SqlSession sqlSession = MybatisUtil.open();

        //List<Provider> list = sqlSession.selectList("com.mybatistest.dao.mappers.ProviderMapper.selectAllProvider");
        //System.out.println(list.toString());
        //System.out.println("==============================");
        ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
        List<Provider> list2 = mapper.getProviderByName("北京");
        System.out.println(list2.toString());
        mapper.modifyNameByParam("proNameName",18);
        /*Provider provider1 = new Provider();
        provider1.setId(1);
        provider1.setProName("北京三木堂商贸有限公司1");
        provider1.setProCode("BJ_GYS001");
        mapper.modifyProvider(provider1);
        Provider provider = mapper.getProviderByid(1);
        System.out.println(provider.toString());*/
        sqlSession.close();
    }
}
