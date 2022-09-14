package com.mybatistest.dao;

import com.mybatistest.pojo.Provider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface ProviderMapper {
    public List<Provider> selectAllProvider();
    public List<Provider> getProviderByName(String proName);
    public  Provider getProviderByid(int id);
    public int modifyNameByParam(@Param("proName")String proName, @Param("id")int id);
    public int modifyProvider(Provider provider);
    public int add1Provider(Provider provider);
    public int delete1ProviderByid(@Param("id")int id);
    public Provider selectAllBillByProviderid(int id);
    public List<Provider> dynamicSelect(Provider provider);
    public int dynamicUpdate(Provider provider);
    public List selectByIds(int[] ids);
    public int dynamicUpdateTrim(Provider provider);
    public List<Provider> selectAllBillByIds(int[] ids);
    public List<Provider> selectAllBillByListIds(List list);
    public List<Provider> selectALlBillByCodeAndIds(Map map);
    public List<Provider> chooseSelect(Provider provider);
    public int selectCountAll();
    public List<Provider>selectByPage(Map<String, Object> params);
    public int delete1ProviderByIds(int[] ids);


}
