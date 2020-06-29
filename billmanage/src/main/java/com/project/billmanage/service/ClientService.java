package com.project.billmanage.service;

import com.project.billmanage.entities.pojo.Client;

import java.util.List;

public interface ClientService {
    List<Client> selectAll();
    Client selectOne(String clientName);
    int insert(Client client,String roleName);
    int delete(int clientId);
    int update(Client client,String rolename);
}
