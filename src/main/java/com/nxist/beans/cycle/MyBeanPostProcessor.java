package com.nxist.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: xym760
 * @Date: 2019/6/3 11:33
 * @Description:
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("调用bean前置处理器方法：postProcessBeforeInitialization........"+o+",   "+s);
        if("car".equals(s)){
            //.......
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("调用bean后置处理器方法：postProcessAfterInitialization........"+o+",   "+s);
        Car car=new Car();
        car.setBrand("擎天柱");
        return car;
    }
}
