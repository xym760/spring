package com.nxist.beans.factory;

/**
 * @Author: xym760
 * @Date: 2019/5/31 10:22
 * @Description:
 */
public class Car {
    private String brand;
    private double price;

    public Car() {
        System.out.println("Appear a car!!!!!");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}
