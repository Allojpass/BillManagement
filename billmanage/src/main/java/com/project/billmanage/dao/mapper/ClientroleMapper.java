package com.project.billmanage.dao.mapper;

import com.project.billmanage.entities.pojo.Clientrole;
import com.project.billmanage.entities.pojo.ClientroleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClientroleMapper {
    int countByExample(ClientroleExample example);

    int deleteByExample(ClientroleExample example);

    int deleteByPrimaryKey(Integer crid);

    int insert(Clientrole record);

    int insertSelective(Clientrole record);

    List<Clientrole> selectByExample(ClientroleExample example);

    Clientrole selectByPrimaryKey(Integer crid);

    int updateByExampleSelective(@Param("record") Clientrole record, @Param("example") ClientroleExample example);

    int updateByExample(@Param("record") Clientrole record, @Param("example") ClientroleExample example);

    int updateByPrimaryKeySelective(Clientrole record);

    int updateByPrimaryKey(Clientrole record);
}