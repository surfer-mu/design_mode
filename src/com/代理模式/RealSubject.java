package com.代理模式;

/**
 * Created by mu on 2017/9/25.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject");
    }
}
