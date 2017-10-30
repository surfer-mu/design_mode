package com.模板方法模式;

/**
 * Created by mu on 2017/10/1.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass aClass=new ConcreteClass();
        aClass.TemplateMethod();
    }
}
