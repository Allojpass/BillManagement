package com.project.billmanage.dao.mapper;

import com.project.billmanage.entities.others.ClientShow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientShowMapper {
    ClientShow selectOneClient(String clientName);
    List<ClientShow> selectAllClient();
}
