package com.project.billmanage.entities.pojo;

public class Rrole {
    private Integer rroleid;

    private String rolename;

    private String memo;

    public Integer getRroleid() {
        return rroleid;
    }

    public void setRroleid(Integer rroleid) {
        this.rroleid = rroleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}