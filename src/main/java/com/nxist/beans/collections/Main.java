package com.nxist.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xym760
 * @Date: 2019/5/30 16:28
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person= (Person) applicationContext.getBean("person3");
        System.out.println(person);
        NewPerson newPerson= (NewPerson) applicationContext.getBean("newPerson");
        System.out.println(newPerson);
        DataSource dataSource=applicationContext.getBean(DataSource.class);
        System.out.println(dataSource.getProperties());
        Person person1= (Person) applicationContext.getBean("person5");
        System.out.println(person1);
    }
}
