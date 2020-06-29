package com.project.billmanage.controller;


import com.project.billmanage.entities.pojo.Bill;
import com.project.billmanage.service.BillService;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BillController {
    @Autowired
    BillService billService;

    @RequiresRoles(value={"user","admin"},logical= Logical.OR)
    @RequiresPermissions(value={"client:user","client:admin"},logical= Logical.OR)
    @RequestMapping("/Bill/selectOne")
    @ResponseBody
    public Bill selectOneBill(String commoditiesname,String suppliername,Integer pay){
        return billService.selectOne(commoditiesname,suppliername,pay);
    }

    @RequestMapping("/Bill/selectAll")
    @ResponseBody
    public List<Bill> selectAllBill(){
        return billService.selectAll();
    }

    @RequestMapping("/Bill/insert")
    @ResponseBody
    public int insertOneBill(@RequestBody Bill bill){
            return billService.insert(bill);
    }

    @RequestMapping("/Bill/update")
    @ResponseBody
    public int updateOneBill(@RequestBody Bill bill){
        return billService.update(bill);
    }

    @RequestMapping("/Bill/delete")
    @ResponseBody
    public int deleteOneBill(int billid){
        return billService.delete(billid);
    }

}
