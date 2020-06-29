package com.project.billmanage.service;

import com.project.billmanage.entities.others.ClientShow;

import java.util.List;

public interface ClientShowService {
    ClientShow selectOne(String clientName);

    List<ClientShow> selectAll();
}
