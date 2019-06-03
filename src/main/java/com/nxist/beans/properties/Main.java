package com.nxist.beans.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Author: xym760
 * @Date: 2019/5/31 16:09
 * @Description:
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans-properties.xml");
        DataSource dataSource= (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }
}
