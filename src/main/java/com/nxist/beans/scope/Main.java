package com.nxist.beans.scope;

import com.nxist.beans.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xym760
 * @Date: 2019/5/31 15:22
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-scope.xml");
        Car car= (Car) applicationContext.getBean("car");
        Car car2= (Car) applicationContext.getBean("car");
        System.out.println(car==car2);
    }
}
