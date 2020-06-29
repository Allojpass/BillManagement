package com.project.billmanage.dao.mapper;

import com.project.billmanage.entities.pojo.Bill;
import com.project.billmanage.entities.pojo.BillExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BillMapper {
    int countByExample(BillExample example);

    int deleteByExample(BillExample example);

    int deleteByPrimaryKey(Integer billid);

    int insert(Bill record);

    int insertSelective(Bill record);

    List<Bill> selectByExampleWithBLOBs(BillExample example);

    List<Bill> selectByExample(BillExample example);

    Bill selectByPrimaryKey(Integer billid);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByExampleWithBLOBs(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKeyWithBLOBs(Bill record);

    int updateByPrimaryKey(Bill record);
}