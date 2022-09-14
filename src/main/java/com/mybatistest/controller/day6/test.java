package com.mybatistest.controller.day6;

import com.mybatistest.controller.day4.classtest;
import com.mybatistest.pojo.Provider;
import com.mybatistest.service.ProviderService;
import com.mybatistest.service.impl.ProviderServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class test {
    private static org.apache.log4j.Logger logger = Logger.getLogger(test.class);
    public static void main(String[] args){
        logger.debug("");
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        ProviderService ps = (ProviderService) ac.getBean("providerService");
//        System.out.println(ps.selectAllProvider().toString());//test1
        System.out.println("============================================================================");
        Provider p = new Provider();
        //p.setId(20);
        p.setProCode("proCode");
        p.setProName("proName");
        p.setProDesc("proDesc");
        p.setProContact("proContact");
        p.setProPhone("proPhone");
        p.setProAddress("proAddress");
        p.setProFax("proFax");
        p.setCreatedBy(1);
        p.setCreationDate(new Date());
        ps.add1Provider(p);
        //ps.dynamicUpdate(p);
    }
}
