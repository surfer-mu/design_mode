package com.适配器;

/**
 * Created by mu on 2017/10/2.
 */
public class Adaptee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void go(){
        System.out.println("姚明攻击");
    }
    public void back(){
        System.out.println("姚明防御");
    }
}
