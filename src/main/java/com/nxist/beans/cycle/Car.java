package com.nxist.beans.cycle;

/**
 * @Author: xym760
 * @Date: 2019/6/3 11:17
 * @Description:
 */
public class Car {
    public Car() {
        System.out.println("Car's constructor...........");
    }

    private String brand;

    public void setBrand(String brand) {
        System.out.println("set brand........");
        this.brand = brand;
    }

    public void init2() {
        System.out.println("init......");
    }

    public void destroy() {
        System.out.println("destroy.........");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
