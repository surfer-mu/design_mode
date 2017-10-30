package com.模板方法模式;

/**
 * Created by mu on 2017/10/1.
 */
public abstract class AbstractClass {
    public void TemplateMethod(){
        System.out.println("模板方法啦");
        operation1();
        operation2();
    }

    public abstract void operation2();

    public abstract void operation1();
}
