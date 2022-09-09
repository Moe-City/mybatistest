package com.mybatistest.controller.day3;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.Provider;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class test7 {
    public static void main(String[] args){
        SqlSession sqlSession = MybatisUtil.open();
        ProviderMapper providerMapper = sqlSession.getMapper(ProviderMapper.class);
        Provider provider2 = new Provider();

        provider2.setProName("北京");

        provider2.setProCode("GZ");

        provider2.setProContact("孙");

        String str1 = "2013-03-25 16:52:07";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date myDate = null;
        try {
            myDate = sdf1.parse(str1);
        }catch (Exception e){
            e.printStackTrace();
        }
        provider2.setCreationDate(myDate);

        List<Provider> list = providerMapper.chooseSelect(provider2);
        System.out.println(list.toString());
        sqlSession.close();
    }
}
