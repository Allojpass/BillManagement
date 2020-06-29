package com.project.billmanage.controller;

import com.project.billmanage.entities.others.ClientShow;
import com.project.billmanage.entities.pojo.Client;
import com.project.billmanage.service.ClientService;
import com.project.billmanage.service.ClientShowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    ClientService clientService;

    @Autowired
    ClientShowService clientShowService;
    protected static final Logger logger = LoggerFactory.getLogger(ClientController.class);
    @RequestMapping("/Client/selectAll")
    @ResponseBody
    public List<ClientShow> selectAll(){
        return clientShowService.selectAll();
    }


    @RequestMapping("/Client/selectOne")
    @ResponseBody
    public ClientShow selectOne(String clientName){
        logger.info(clientName);
        return clientShowService.selectOne(clientName);
    }


    @RequestMapping("/Client/insert")
    @ResponseBody
    public int insert(String rolename,@RequestBody Client client){
        logger.info(rolename+""+client.getClientname());
        return clientService.insert(client,rolename);
    }

    @RequestMapping("/Client/delete")
    @ResponseBody
    public int delete(int clientId){
        logger.info(clientId+"");
        return clientService.delete(clientId);
    }

    @RequestMapping("/Client/update")
    @ResponseBody
    public int update(String rolename,@RequestBody Client client){
        logger.info(client.getClientid()+"");
        return clientService.update(client,rolename);
    }

}
