package com.mybatistest.service;

import com.mybatistest.pojo.PageBean;
import com.mybatistest.pojo.Provider;

import java.util.List;

public interface ProviderService {
    //分页
    PageBean<Provider> providerByPage(int pageNow, int pageSize);
}
