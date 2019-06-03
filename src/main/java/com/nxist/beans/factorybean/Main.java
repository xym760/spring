package com.nxist.beans.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xym760
 * @Date: 2019/6/3 15:37
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-beanfactory.xml");
        Car car= (Car) applicationContext.getBean("car");
        System.out.println(car);
    }
}
