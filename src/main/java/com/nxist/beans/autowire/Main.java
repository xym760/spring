package com.nxist.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xym760
 * @Date: 2019/5/31 10:34
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-autowire.xml");
        Person person= (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
