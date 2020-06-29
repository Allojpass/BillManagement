package com.project.billmanage.controller;

import com.project.billmanage.entities.pojo.Supplier;
import com.project.billmanage.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @RequestMapping("/Supplier/selectAll")
    @ResponseBody
    public List<Supplier> selectAll(){
        return supplierService.selectAll();
    }

    @RequestMapping("/Supplier/selectOne")
    @ResponseBody
    public Supplier selectOne(String suppliername){
        return supplierService.selectOne(suppliername);
    }

    @RequestMapping("/Supplier/insert")
    @ResponseBody
    public int insert(@RequestBody Supplier supplier){
        return supplierService.insert(supplier);
    }

    @RequestMapping("/Supplier/delete")
    @ResponseBody
    public int delete(int supplierid){
     return supplierService.delete(supplierid);
    }

    @RequestMapping("/Supplier/update")
    @ResponseBody
    public int update(@RequestBody Supplier supplier){
        return supplierService.update(supplier);
    }
}
