package com.mybatistest.controller.day7;

import com.mybatistest.dao.sstMapper;
import com.mybatistest.pojo.Bill;
import com.mybatistest.pojo.User;
import com.mybatistest.service.BillService;
import com.mybatistest.service.ProviderService;
import com.mybatistest.service.UserService;
import com.mybatistest.service.impl.BillServiceImpl;
import com.mybatistest.service.impl.UserServiceImpl;
import com.mybatistest.service.sstService;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    private static org.apache.log4j.Logger logger = Logger.getLogger(com.mybatistest.controller.day6.test.class);

    public static void main(String[] args){
        logger.debug("");
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        BillService bs = (BillService) ac.getBean("billService");
//        System.out.println(bs.selectBillById(2).toString());
        Bill bill = new Bill();
        //bill.setId(19);
        bill.setBillCode("asdfghj");
        System.out.println(bs.insertBill(bill));
        System.out.println(bs.updateBillById("billCode", 28));
        System.out.println(bs.deleteBillById(28));
        UserService userService = (UserService) ac.getBean("userService");
        userService.modifyUserName("user17", 19);
        userService.modifyUserPassword("password17", 19);
        userService.deleteAUser(19);
        sstService ss = (sstService) ac.getBean("sstService");
        ss.deleteAUser(19);
    }
}
