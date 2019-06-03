package com.nxist.beans.spel;

/**
 * @Author: xym760
 * @Date: 2019/5/31 10:22
 * @Description:
 */
public class Car {
    private String brand;
    private double price;
    //轮胎的周长
    private double tyrePerimeter;

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

    public double getTyrePerimeter() {
        return tyrePerimeter;
    }

    public void setTyrePerimeter(double tyrePerimeter) {
        this.tyrePerimeter = tyrePerimeter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", tyrePerimeter=" + tyrePerimeter +
                '}';
    }
}
