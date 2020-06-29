package com.project.billmanage.dao.mapper;

import com.project.billmanage.entities.others.LoginReturn;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginReturnMapper {
    LoginReturn selectLoginReturnMessage(String clientname);
}
