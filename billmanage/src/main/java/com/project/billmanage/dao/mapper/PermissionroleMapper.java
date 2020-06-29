package com.project.billmanage.dao.mapper;

import com.project.billmanage.entities.pojo.Permissionrole;
import com.project.billmanage.entities.pojo.PermissionroleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PermissionroleMapper {
    int countByExample(PermissionroleExample example);

    int deleteByExample(PermissionroleExample example);

    int deleteByPrimaryKey(Integer prid);

    int insert(Permissionrole record);

    int insertSelective(Permissionrole record);

    List<Permissionrole> selectByExample(PermissionroleExample example);

    Permissionrole selectByPrimaryKey(Integer prid);

    int updateByExampleSelective(@Param("record") Permissionrole record, @Param("example") PermissionroleExample example);

    int updateByExample(@Param("record") Permissionrole record, @Param("example") PermissionroleExample example);

    int updateByPrimaryKeySelective(Permissionrole record);

    int updateByPrimaryKey(Permissionrole record);
}