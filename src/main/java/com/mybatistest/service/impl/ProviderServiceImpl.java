package com.mybatistest.service.impl;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.PageBean;
import com.mybatistest.pojo.Provider;
import com.mybatistest.service.ProviderService;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProviderServiceImpl implements ProviderService {

    @Override
    public PageBean<Provider> providerByPage(int pageNow, int pageSize) {
        PageBean<Provider> pageBean = new PageBean<Provider>();
        pageBean.setPageNow(pageNow);
        pageBean.setPageSize(pageSize);
        Map<String, Object> map  = new HashMap<String, Object>();
        map.put("start",(pageNow-1)*pageSize);
        map.put("size",pageSize);
        SqlSession sqlSession = MybatisUtil.open();
        ProviderMapper providerMapper = sqlSession.getMapper(ProviderMapper.class);
        int count = providerMapper.selectCountAll();
        pageBean.setTotal(count);
        int pages = count/pageSize;
        if (count%pageSize!=0)
            pages+=1;
        pageBean.setPages(pages);
        List<Provider> list = providerMapper.selectByPage(map);
        pageBean.setList(list);
        MybatisUtil.close(sqlSession);
        return pageBean;
    }
}
