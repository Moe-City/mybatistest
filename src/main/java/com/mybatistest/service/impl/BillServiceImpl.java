package com.mybatistest.service.impl;

import com.mybatistest.dao.BillMapper;
import com.mybatistest.pojo.Bill;
import com.mybatistest.pojo.PageBean;
import com.mybatistest.service.BillService;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service("billService")
public class BillServiceImpl implements BillService {

    @Override
    public PageBean<Bill> billByPage(int pageNow, int pageSize){
        PageBean<Bill> pageBean = new PageBean<Bill>();
        pageBean.setPageNow(pageNow);
        pageBean.setPageSize(pageSize);
        Map<String, Object> map  = new HashMap<String, Object>();
        map.put("start",(pageNow-1)*pageSize);
        map.put("size",pageSize);
        SqlSession sqlSession = MybatisUtil.open();
        BillMapper billMapper = sqlSession.getMapper(BillMapper.class);
        int count = billMapper.selectCountAll();
        pageBean.setTotal(count);
        int pages = count/pageSize;
        if (count%pageSize!=0)
            pages+=1;
        pageBean.setPages(pages);
        List<Bill> list = billMapper.selectByPage(map);
        pageBean.setList(list);
        MybatisUtil.close(sqlSession);
        return pageBean;
    }
}
