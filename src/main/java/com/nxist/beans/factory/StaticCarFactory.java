package com.nxist.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xym760
 * @Date: 2019/6/3 14:35
 * @Description:静态工厂方法：直接调用某个类想静态方法就可以返回Bean的实例
 */
public class StaticCarFactory {
    private static Map<String, Car> cars = new HashMap<>();
    static{
        cars.put("Audi",new Car("Audi",300000));
        cars.put("Ford",new Car("Ford",400000));
    }
    //静态工厂方法
    public static Car getCar(String name) {
        return cars.get(name);
    }
}
