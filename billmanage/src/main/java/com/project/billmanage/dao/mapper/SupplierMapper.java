package com.project.billmanage.dao.mapper;

import com.project.billmanage.entities.pojo.Supplier;
import com.project.billmanage.entities.pojo.SupplierExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SupplierMapper {
    int countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer supplierid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExampleWithBLOBs(SupplierExample example);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(Integer supplierid);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExampleWithBLOBs(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKeyWithBLOBs(Supplier record);

    int updateByPrimaryKey(Supplier record);
}