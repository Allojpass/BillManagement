package com.project.billmanage.controller;

import com.project.billmanage.dao.mapper.ClientMapper;
import com.project.billmanage.dao.mapper.LoginReturnMapper;
import com.project.billmanage.entities.others.LoginClient;
import com.project.billmanage.entities.others.LoginReturn;
import com.project.billmanage.entities.others.ResponseBo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {
    protected static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    ClientMapper clientMapper;

    @Autowired
    LoginReturnMapper loginReturnMapper;

    @RequestMapping("/login")
    @ResponseBody
    public ResponseBo login(@RequestBody LoginClient loginuser) {
        logger.info(loginuser.username+loginuser.password);
        logger.info(loginuser.rememberMe+"");
        UsernamePasswordToken token = new UsernamePasswordToken(loginuser.username, loginuser.password,loginuser.rememberMe);
        // 获取Subject对象
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            logger.info("已经完成shiro认证");
        } catch (UnknownAccountException e) {
            return ResponseBo.error(e.getMessage());
        } catch (IncorrectCredentialsException e) {
            return ResponseBo.error(e.getMessage());
        } catch (LockedAccountException e) {
            return ResponseBo.error(e.getMessage());
        } catch (AuthenticationException e) {
            return ResponseBo.error("认证失败！");
        }
        logger.info(loginuser.username);
        LoginReturn loginReturn = loginReturnMapper.selectLoginReturnMessage(loginuser.username);
        logger.info(loginReturn.getRoleName());
        return  ResponseBo.ok(loginReturn);
    }

    @RequestMapping("/logout")
    public String logout(){
        SecurityUtils.getSubject().logout();
        return "redirect:index.html";
    }
}
