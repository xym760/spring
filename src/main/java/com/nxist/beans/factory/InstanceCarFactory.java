package com.nxist.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xym760
 * @Date: 2019/6/3 14:56
 * @Description:实例工厂方法：实例工厂的方法，即要创建实例工厂的对象，再调用工厂对象的实例方法返回Bean的实例
 */
public class InstanceCarFactory {
    private Map<String,Car> cars;
    public InstanceCarFactory(){
        cars=new HashMap<>();
        cars.put("Audi",new Car("Audi",300000));
        cars.put("Ford",new Car("Ford",400000));
    }
    public Car getCar(String brand){
        return cars.get(brand);
    }
}
