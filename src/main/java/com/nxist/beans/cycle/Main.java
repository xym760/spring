package com.nxist.beans.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xym760
 * @Date: 2019/6/3 11:24
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-cycle.xml");
        Car car= (Car) applicationContext.getBean("car");
        System.out.println(car);
        //关闭容器
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
