package com.project.billmanage.entities.pojo;

import java.sql.Date;

public class Bill {
    private Integer billid;

    private String billcode;

    private String commoditiesname;

    private String suppliername;

    private Double price;

    private Integer pay;

    private Date createtime;

    private String description;

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }

    public String getCommoditiesname() {
        return commoditiesname;
    }

    public void setCommoditiesname(String commoditiesname) {
        this.commoditiesname = commoditiesname == null ? null : commoditiesname.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}