package com.nxist.beans.relation;

import com.nxist.beans.autowire.Address;
import com.nxist.beans.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xym760
 * @Date: 2019/5/31 11:06
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-relation.xml");
//        Address address= (Address) applicationContext.getBean("address");
//        System.out.println(address);
        Address address= (Address) applicationContext.getBean("address2");
        System.out.println(address);
        Person person= (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
