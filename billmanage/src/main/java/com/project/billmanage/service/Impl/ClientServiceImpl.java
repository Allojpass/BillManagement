package com.project.billmanage.service.Impl;

import com.project.billmanage.dao.mapper.ClientMapper;
import com.project.billmanage.dao.mapper.ClientroleMapper;
import com.project.billmanage.dao.mapper.RroleMapper;
import com.project.billmanage.entities.pojo.*;
import com.project.billmanage.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientMapper clientMapper;
    @Autowired
    ClientroleMapper clientroleMapper;
    @Autowired
    RroleMapper rroleMapper;

    public List<Client> selectAll(){
        ClientExample clientExample = new ClientExample();
        ClientExample.Criteria criteria = clientExample.createCriteria();
        return clientMapper.selectByExample(clientExample);
    }

    public Client selectOne(String clientName){
        ClientExample clientExample = new ClientExample();
        ClientExample.Criteria criteria = clientExample.createCriteria();
        criteria.andClientnameEqualTo(clientName);
        return clientMapper.selectByExample(clientExample).get(0);
    }
@Transactional
    public int insert(Client client,String roleName){
        if (clientMapper.insertSelective(client)==1){
            //找出用户的数据库生成主键
            ClientExample clientExample = new ClientExample();
            ClientExample.Criteria criteriaClient = clientExample.createCriteria();
            criteriaClient.andClientnameEqualTo(client.getClientname());
            Client client1 = clientMapper.selectByExample(clientExample).get(0);
            //找出用户输入的对应角色
            RroleExample rroleExample = new RroleExample();
            RroleExample.Criteria criteria = rroleExample.createCriteria();
            criteria.andRolenameEqualTo(roleName);
            Rrole rrole = rroleMapper.selectByExample(rroleExample).get(0);
            //生成该用户对应的角色关系
            Clientrole clientrole = new Clientrole();
            clientrole.setRroleid(rrole.getRroleid());
            clientrole.setClientid(client1.getClientid());
            clientroleMapper.insertSelective(clientrole);
            return 1;
        }else{
            return 0;
        }

    }
@Transactional
    public int delete(int clientId){
        ClientroleExample clientroleExample = new ClientroleExample();
        ClientroleExample.Criteria criteria = clientroleExample.createCriteria();
        criteria.andClientidEqualTo(clientId);
        int crid = clientroleMapper.selectByExample(clientroleExample).get(0).getCrid();
        clientroleMapper.deleteByPrimaryKey(crid);
        return clientMapper.deleteByPrimaryKey(clientId);
    }

    @Transactional
    public int update(Client client,String rolename){
        int tempId = client.getClientid();
        ClientExample clientExample = new ClientExample();
        ClientExample.Criteria criteria = clientExample.createCriteria();
        criteria.andClientidEqualTo(tempId);

        RroleExample rroleExample = new RroleExample();
        RroleExample.Criteria criteria1 = rroleExample.createCriteria();
        criteria1.andRolenameEqualTo(rolename);
        int roleId = rroleMapper.selectByExample(rroleExample).get(0).getRroleid();
        Clientrole clientrole = new Clientrole();
        clientrole.setRroleid(roleId);
        ClientroleExample clientroleExample = new ClientroleExample();
        ClientroleExample.Criteria criteria2 = clientroleExample.createCriteria();
        criteria2.andClientidEqualTo(tempId);
        client.setClientid(null);
        return clientMapper.updateByExampleSelective(client,clientExample)&clientroleMapper.updateByExampleSelective(clientrole,clientroleExample);
    }
}
