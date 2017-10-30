package com.模板方法模式;

/**
 * Created by mu on 2017/10/1.
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void operation2() {
        System.out.println("operation2");
    }

    @Override
    public void operation1() {
        System.out.println("operation1");
    }
}
