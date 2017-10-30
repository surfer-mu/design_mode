package com.工厂模式;

/**
 * Created by mu on 2017/10/1.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory=new GraduateFactory();
        LeiFeng graduate = factory.CreateLeiFeng();
        graduate.sweep();
        graduate.buyRice();

    }
}
