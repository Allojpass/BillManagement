package com.project.billmanage.dao.mapper;

import com.project.billmanage.entities.pojo.Rrole;
import com.project.billmanage.entities.pojo.RroleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RroleMapper {
    int countByExample(RroleExample example);

    int deleteByExample(RroleExample example);

    int deleteByPrimaryKey(Integer rroleid);

    int insert(Rrole record);

    int insertSelective(Rrole record);

    List<Rrole> selectByExample(RroleExample example);

    Rrole selectByPrimaryKey(Integer rroleid);

    int updateByExampleSelective(@Param("record") Rrole record, @Param("example") RroleExample example);

    int updateByExample(@Param("record") Rrole record, @Param("example") RroleExample example);

    int updateByPrimaryKeySelective(Rrole record);

    int updateByPrimaryKey(Rrole record);

    List<Rrole> selectByClientId(int clientId);
}