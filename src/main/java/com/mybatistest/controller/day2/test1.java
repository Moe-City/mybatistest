package com.mybatistest.controller.day2;

import com.mybatistest.dao.BillMapper;
import com.mybatistest.pojo.Bill;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public class test1 {
    public static void main (String[] args){
        SqlSession sqlSession = MybatisUtil.open();
        BillMapper mapper2 = sqlSession.getMapper(BillMapper.class);
        Map param = new HashMap();
        param.put("productName", "油");
        param.put("providerId", 6);
        param.put("isPayment", 2);
        Bill bill = mapper2.showBillAndProvider(param);
        System.out.println(bill.toString2());
    }
}
