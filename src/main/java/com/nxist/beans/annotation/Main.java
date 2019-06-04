package com.nxist.beans.annotation;

import com.nxist.beans.annotation.controller.UserController;
import com.nxist.beans.annotation.repository.UserRepository;
import com.nxist.beans.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xym760
 * @Date: 2019/6/3 16:25
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-annotation.xml");
//        TestObject testObject= (TestObject) applicationContext.getBean("testObject");
//        System.out.println(testObject);
//
        UserController userController= (UserController) applicationContext.getBean("userController");
        System.out.println(userController);
        userController.execute();
//
//        UserService userService= (UserService) applicationContext.getBean("userService");
//        System.out.println(userService);

//        UserRepository userRepository= (UserRepository) applicationContext.getBean("userRepository");
//        System.out.println(userRepository);
    }
}
