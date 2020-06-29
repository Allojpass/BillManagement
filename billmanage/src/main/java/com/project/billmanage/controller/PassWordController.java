package com.project.billmanage.controller;

import com.project.billmanage.service.PassWordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PassWordController {
    @Autowired
    PassWordService passWordService;
    protected static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("/client/passWord")
    @ResponseBody
    public int changePassWord(int clientid,String password){
        logger.info(clientid+""+password);
        return passWordService.changePassWord(clientid,password);
    }
}
