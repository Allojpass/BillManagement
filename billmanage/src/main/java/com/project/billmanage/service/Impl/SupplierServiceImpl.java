package com.project.billmanage.service.Impl;

import com.project.billmanage.dao.mapper.SupplierMapper;
import com.project.billmanage.entities.pojo.Supplier;
import com.project.billmanage.entities.pojo.SupplierExample;
import com.project.billmanage.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SupplierMapper supplierMapper;

    @Override
    public List<Supplier> selectAll(){
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        return supplierMapper.selectByExampleWithBLOBs(supplierExample);
    }

    @Override
    public Supplier selectOne(String suppliername){
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        criteria.andSuppliernameEqualTo(suppliername);
        return supplierMapper.selectByExampleWithBLOBs(supplierExample).get(0);
    }

    @Override
    public int delete(int supplierid){
        return supplierMapper.deleteByPrimaryKey(supplierid);
    }

    @Override
    public int insert(Supplier supplier){
        return supplierMapper.insertSelective(supplier);
    }

    @Override
    public int update(Supplier supplier){
        int tempId = supplier.getSupplierid();
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        criteria.andSupplieridEqualTo(tempId);
        supplier.setSupplierid(null);
        return supplierMapper.updateByExampleSelective(supplier,supplierExample);
    }
}
