package com.外观模式;

/**
 * Created by mu on 2017/10/1.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.methodA();
        facade.methodB();
    }
}
