package com.nxist.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: xym760
 * @Date: 2019/6/3 15:22
 * @Description:自定义的FactoryBean需要实现Spring的FactoryBean接口
 */
public class CarFactoryBean implements FactoryBean<Car> {
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //返回bean的对象
    @Override
    public Car getObject() throws Exception {
        return new Car(brand, 2000000);
    }

    //返回的bean的类型
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
