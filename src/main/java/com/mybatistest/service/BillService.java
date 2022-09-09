package com.mybatistest.service;

import com.mybatistest.pojo.Bill;
import com.mybatistest.pojo.PageBean;
import com.mybatistest.pojo.Provider;

public interface BillService {
    PageBean<Bill> billByPage(int pageNow, int pageSize);
}
