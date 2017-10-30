package com.桥接模式;

/**
 * Created by mu on 2017/10/18.
 */
public class ConcreteImplementA implements Implementor {
    @Override
    public void operatorImp() {
        System.out.println("具体实现A");
    }
}
