package com.mybatistest.controller.day3;

import com.mybatistest.controller.day4.classtest;
import com.mybatistest.dao.BillMapper;
import com.mybatistest.pojo.Bill;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;

public class test1 {
    private static Logger logger = Logger.getLogger(test1.class);
    public static void main(String[] args){
        logger.info("test");
        SqlSession sqlSession = MybatisUtil.open();
        BillMapper mapper = sqlSession.getMapper(BillMapper.class);
        Bill bill = new Bill();
        bill.setProductName("油");
        List<Bill> list = mapper.dynamicGetBill(bill);
        System.out.println(list.toString());
        System.out.println("======================================");
        Bill bill2 = new Bill();
        bill2.setProviderId(2);
        list = mapper.dynamicGetBill(bill2);
        System.out.println(list.toString());
        System.out.println("======================================");
        Bill bill3 = new Bill();
        bill3.setIsPayment(1);
        list = mapper.dynamicGetBill(bill3);
        System.out.println(list.toString());
        sqlSession.close();
    }
}
