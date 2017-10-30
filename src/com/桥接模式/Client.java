package com.桥接模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Client {
    public static void main(String[] args) {
        Abstraction abstraction=new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementA());
        abstraction.operator();

        abstraction.setImplementor(new ConcreteImplementB());
        abstraction.operator();
    }
}
