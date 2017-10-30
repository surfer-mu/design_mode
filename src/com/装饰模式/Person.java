package com.装饰模式;

/**
 * Created by mu on 2017/9/16.
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void show(){
        System.out.println("我的名字是："+name);
    }
}
