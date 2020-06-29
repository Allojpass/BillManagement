package com.project.billmanage.service.Impl;

import com.project.billmanage.dao.mapper.ClientMapper;
import com.project.billmanage.entities.pojo.Client;
import com.project.billmanage.entities.pojo.ClientExample;
import com.project.billmanage.service.ClientService;
import com.project.billmanage.service.PassWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassWordServiceImpl implements PassWordService {
    @Autowired
    ClientMapper clientMapper;

    @Override
    public int changePassWord(int clientId,String password){
        return clientMapper.updatePassWord(clientId,password);
    }
}
