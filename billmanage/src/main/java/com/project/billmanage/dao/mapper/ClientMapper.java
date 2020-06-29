package com.project.billmanage.dao.mapper;

import com.project.billmanage.entities.pojo.Client;
import com.project.billmanage.entities.pojo.ClientExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClientMapper {
    int countByExample(ClientExample example);

    int deleteByExample(ClientExample example);

    int deleteByPrimaryKey(Integer clientid);

    int insert(Client record);

    int insertSelective(Client record);

    List<Client> selectByExample(ClientExample example);

    Client selectByPrimaryKey(Integer clientid);

    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);

    int updatePassWord(int clientId,String password);
}