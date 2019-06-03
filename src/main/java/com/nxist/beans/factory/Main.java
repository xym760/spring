package com.nxist.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xym760
 * @Date: 2019/6/3 14:46
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-factory.xml");
        Car car1 = (Car) applicationContext.getBean("car1");
        System.out.println(car1);
        Car car2= (Car) applicationContext.getBean("car2");
        System.out.println(car2);
    }
}
