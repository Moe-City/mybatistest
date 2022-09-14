package com.mybatistest.service.impl;

import com.mybatistest.dao.ProviderMapper;
import com.mybatistest.pojo.PageBean;
import com.mybatistest.pojo.Provider;
import com.mybatistest.service.ProviderService;
import com.mybatistest.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service("providerService")
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderMapper providerMapper;


    @Override
    public List<Provider> selectAllProvider() {
        return providerMapper.selectAllProvider();
    }

    @Override
    public List<Provider> getProviderByName(String proName) {
        return providerMapper.getProviderByName(proName);
    }

    @Override
    public Provider getProviderByid(int id) {
        return providerMapper.getProviderByid(id);
    }

    @Override
    public int modifyNameByParam(String proName, int id) {
        return providerMapper.modifyNameByParam(proName, id);
    }

    @Override
    public int modifyProvider(Provider provider) {
        return providerMapper.modifyProvider(provider);
    }

    @Override
    public int add1Provider(Provider provider) {
        /*int o =providerMapper.add1Provider(provider);
        int i = 6/0;//测试事务用
        return o;*/
        return providerMapper.add1Provider(provider);
    }

    @Override
    public int delete1ProviderByid(int id) {
        return providerMapper.delete1ProviderByid(id);
    }

    @Override
    public Provider selectAllBillByProviderid(int id) {
        return providerMapper.selectAllBillByProviderid(id);
    }

    @Override
    public List<Provider> dynamicSelect(Provider provider) {
        return providerMapper.dynamicSelect(provider);
    }

    @Override
    public int dynamicUpdate(Provider provider) {
        return providerMapper.dynamicUpdate(provider);
    }

    @Override
    public List selectByIds(int[] ids) {
        return providerMapper.selectByIds(ids);
    }

    @Override
    public int dynamicUpdateTrim(Provider provider) {
        return providerMapper.dynamicUpdateTrim(provider);
    }

    @Override
    public List<Provider> selectAllBillByIds(int[] ids) {
        return providerMapper.selectByIds(ids);
    }

    @Override
    public List<Provider> selectAllBillByListIds(List list) {
        return providerMapper.selectAllBillByListIds(list);
    }

    @Override
    public List<Provider> selectALlBillByCodeAndIds(Map map) {
        return providerMapper.selectALlBillByCodeAndIds(map);
    }

    @Override
    public List<Provider> chooseSelect(Provider provider) {
        return providerMapper.chooseSelect(provider);
    }

    @Override
    public int selectCountAll() {
        return providerMapper.selectCountAll();
    }

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

    @Override
    public int delete1ProviderByIds(int[] ids){
        return providerMapper.delete1ProviderByIds(ids);
    }
}
