package com.mybatistest.service;

import com.mybatistest.pojo.Bill;
import com.mybatistest.pojo.PageBean;
import com.mybatistest.pojo.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BillService {
    List<Bill> selectAllBill();
    Bill getBillByNameIdPay(Map map);
    Bill showBillAndProvider(Map param);
    List<Bill> dynamicGetBill(Bill bill);
    int selectCountAll();
    List<Bill>selectByPage(Map<String, Object> params);
    PageBean<Bill> billByPage(int pageNow, int pageSize);
    Bill selectBillById(@Param("id") Integer id);
    int updateBillById(String billCode, Integer id);
    int deleteBillById(@Param("id") Integer id);
    int insertBill(Bill bill);
}
