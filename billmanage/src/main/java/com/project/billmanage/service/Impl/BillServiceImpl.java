package com.project.billmanage.service.Impl;

import com.project.billmanage.dao.mapper.BillMapper;
import com.project.billmanage.entities.pojo.Bill;
import com.project.billmanage.entities.pojo.BillExample;
import com.project.billmanage.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    BillMapper billMapper;

    @Override
    public List<Bill> selectAll(){
        BillExample billExample = new BillExample();
        BillExample.Criteria criteria = billExample.createCriteria();
        List<Bill> list = billMapper.selectByExampleWithBLOBs(billExample);
        return list;
    }
    @Override
    public Bill selectOne(String commoditiesname,String suppliername,Integer pay){
        BillExample billExample = new BillExample();
        BillExample.Criteria criteria = billExample.createCriteria();
        criteria.andCommoditiesnameEqualTo(commoditiesname);
        criteria.andPayEqualTo(pay);
        criteria.andSuppliernameEqualTo(suppliername);
        List<Bill> list = billMapper.selectByExampleWithBLOBs(billExample);
         return list.get(0);
    }
    @Override
    public int insert(Bill bill){
        return billMapper.insertSelective(bill);
    }
    @Override
    public int update(Bill record){
        int tempId = record.getBillid();
        BillExample billExample = new BillExample();
        BillExample.Criteria criteria = billExample.createCriteria();
        criteria.andBillidEqualTo(tempId);
        //查询过bill对应数据后，删除前端传回的billId，这样不会修改数据库中的id属性
        record.setBillid(null);
        return billMapper.updateByExampleSelective(record,billExample);
    }
    @Override
    public int delete(int billid){
        return billMapper.deleteByPrimaryKey(billid);
    }
}
