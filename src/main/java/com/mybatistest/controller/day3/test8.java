package com.mybatistest.controller.day3;

import com.mybatistest.pojo.Bill;
import com.mybatistest.pojo.PageBean;
import com.mybatistest.pojo.Provider;
import com.mybatistest.service.BillService;
import com.mybatistest.service.ProviderService;
import com.mybatistest.service.impl.BillServiceImpl;
import com.mybatistest.service.impl.ProviderServiceImpl;

public class test8 {
    public static void main(String[] args){
        ProviderService providerService = new ProviderServiceImpl();
        PageBean<Provider> pageBean = providerService.providerByPage(1,4);
        System.out.println("当前显示"+pageBean.getPageSize()+"条，当前"+pageBean.getPageNow()+"/"+pageBean.getPages()+"页，共有"+pageBean.getTotal()+"条");
        System.out.println("=============================================================");
        pageBean.getList().forEach(provider -> System.out.println(provider.toString()));
        System.out.println("--------------------------------------------------------------");
        BillService billService = new BillServiceImpl();
        PageBean<Bill> billPageBean = billService.billByPage(2,5);
        System.out.println("当前显示"+billPageBean.getPageSize()+"条，当前"+billPageBean.getPageNow()+"/"+billPageBean.getPages()+"页，共有"+billPageBean.getTotal()+"条");
        System.out.println("=============================================================");
        billPageBean.getList().forEach(bill -> System.out.println(bill.toString()));
    }
}
