package com.project.billmanage.dao.mapper;

import com.project.billmanage.entities.pojo.Supplierbill;
import com.project.billmanage.entities.pojo.SupplierbillExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SupplierbillMapper {
    int countByExample(SupplierbillExample example);

    int deleteByExample(SupplierbillExample example);

    int deleteByPrimaryKey(Integer sbid);

    int insert(Supplierbill record);

    int insertSelective(Supplierbill record);

    List<Supplierbill> selectByExample(SupplierbillExample example);

    Supplierbill selectByPrimaryKey(Integer sbid);

    int updateByExampleSelective(@Param("record") Supplierbill record, @Param("example") SupplierbillExample example);

    int updateByExample(@Param("record") Supplierbill record, @Param("example") SupplierbillExample example);

    int updateByPrimaryKeySelective(Supplierbill record);

    int updateByPrimaryKey(Supplierbill record);
}