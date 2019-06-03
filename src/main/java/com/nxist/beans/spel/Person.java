package com.nxist.beans.spel;

/**
 * @Author: xym760
 * @Date: 2019/5/31 10:17
 * @Description:
 */
public class Person {
    private String name;
    private Car car;
    //引用Address bean中的city属性
    private String city;
    //根据car的price确定info，car的price>=300000，为有钱人，否则为穷人。
    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", city='" + city + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
