package com.project.billmanage.service.Impl;

import com.project.billmanage.dao.mapper.ClientShowMapper;
import com.project.billmanage.entities.others.ClientShow;
import com.project.billmanage.service.ClientShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientShowServiceImpl implements ClientShowService {
    @Autowired
    ClientShowMapper clientShowMapper;
    @Override
    public ClientShow selectOne(String clientName){
        return clientShowMapper.selectOneClient(clientName);
    }

    @Override
    public List<ClientShow> selectAll(){
        return clientShowMapper.selectAllClient();
    }
}
