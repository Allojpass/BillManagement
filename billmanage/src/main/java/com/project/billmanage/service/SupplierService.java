package com.project.billmanage.service;

import com.project.billmanage.entities.pojo.Supplier;

import java.util.List;

public interface SupplierService {
    List<Supplier> selectAll();
    Supplier selectOne(String suppliername);
    int delete(int supplierid);
    int insert(Supplier supplier);
    int update(Supplier supplier);
}
