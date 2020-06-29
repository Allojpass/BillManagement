package com.project.billmanage.service;

import com.project.billmanage.entities.pojo.Bill;
import java.util.List;

public interface BillService {
    public List<Bill> selectAll();
    public Bill selectOne(String commoditiesname,String suppliername,Integer pay);
    public int insert(Bill bill);
    public int update(Bill record);
    public int delete(int billid);
}
