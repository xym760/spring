package com.nxist.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xym760
 * @Date: 2019/5/30 10:21
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        helloWorld.hello();

        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
        car = (Car) applicationContext.getBean("car2");
        System.out.println(car);

        Person person = (Person) applicationContext.getBean("person2");
        System.out.println(person);
    }
}