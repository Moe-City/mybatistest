package com.mybatistest.dao;

import com.mybatistest.pojo.Bill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

public interface BillMapper {
    public List<Bill> selectAllBill();
    public Bill getBillByNameIdPay(Map map);
    public Bill showBillAndProvider(Map param);
    public List<Bill> dynamicGetBill(Bill bill);
    public int selectCountAll();
    public List<Bill>selectByPage(Map<String, Object> params);
}
