package com.project.billmanage.config;

    /**
     *  shiroRealm用来进行shiro安全框架的登录和权限以及角色校验
     *  重写了doGetAuthorizationInfo和doGetAuthenticationInfo两个方法
     *  分别进行权限角色校验和登录密码校验
     *  编写人:王志超
     *  时间：2019年 10月 23日
     */

import com.project.billmanage.dao.mapper.ClientMapper;
import com.project.billmanage.dao.mapper.PermissionMapper;
import com.project.billmanage.dao.mapper.RroleMapper;
import com.project.billmanage.entities.pojo.Client;
import com.project.billmanage.entities.pojo.ClientExample;
import com.project.billmanage.entities.pojo.Permission;
import com.project.billmanage.entities.pojo.Rrole;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    ClientMapper clientMapper;

    @Autowired
    RroleMapper rroleMapper;

    @Autowired
    PermissionMapper permissionMapper;


    protected static final Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

    /**
     * 获取用户角色和权限
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        Client user = (Client) SecurityUtils.getSubject().getPrincipal();
        String clientName = user.getClientname();

        System.out.println("用户" + clientName + "获取权限-----ShiroRealm.doGetAuthorizationInfo");
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        // 获取用户角色集

        List<Rrole> roleList =rroleMapper.selectByClientId(user.getClientid());
        Set<String> roleSet = new HashSet<String>();
        for (Rrole r : roleList) {
            roleSet.add(r.getRolename());
            logger.info(r.getRolename());
        }
        simpleAuthorizationInfo.setRoles(roleSet);

        // 获取用户权限集
        List<Permission> permissionList = permissionMapper.selectByClientId(user.getClientid());
        Set<String> permissionSet = new HashSet<String>();
        for (Permission p : permissionList) {
            permissionSet.add(p.getPermissionname());
            logger.info(p.getPermissionname());
        }
        simpleAuthorizationInfo.setStringPermissions(permissionSet);
        return simpleAuthorizationInfo;
//        return null;
    }

    /**
     * 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        // 获取用户输入的用户名和密码
        String clientName = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());

        System.out.println("用户" + clientName + "认证-----ShiroRealm.doGetAuthenticationInfo");

        // 通过用户名到数据库查询用户信息
        ClientExample clientExample = new ClientExample();
        ClientExample.Criteria criteria = clientExample.createCriteria();
        criteria.andClientnameEqualTo(clientName);
        Client client = clientMapper.selectByExample(clientExample).get(0);
        //打印查询到的密码信息，控制台显示
        logger.info(client.getPassword());
        if (client == null) {
            throw new UnknownAccountException("用户名或密码错误！");
        }
        if (!password.equals(client.getPassword())) {
            throw new IncorrectCredentialsException("用户名或密码错误！");
        }

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(client, password, getName());
        logger.info("已经完成登录认证的doGetAuthenticationInfo()方法");
        return info;
    }
}