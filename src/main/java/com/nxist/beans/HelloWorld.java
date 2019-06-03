package com.nxist.beans;

/**
 * @Author: xym760
 * @Date: 2019/5/30 10:19
 * @Description:
 */
public class HelloWorld {
    private String name;

    public void setName5(String name) {
        this.name = name;
        System.out.println("set调用");
    }

    public void hello(){
        System.out.println("Hello:"+name);
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                '}';
    }

    public HelloWorld() {
        System.out.println("构造调用！");
    }
}
