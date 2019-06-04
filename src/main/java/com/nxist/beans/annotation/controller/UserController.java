package com.nxist.beans.annotation.controller;

import com.nxist.beans.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: xym760
 * @Date: 2019/6/3 16:19
 * @Description:
 */
@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void execute() {
        System.out.println("UserController execute.....");
        userService.add();
    }
}
