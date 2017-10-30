package com.外观模式;

/**
 * Created by mu on 2017/10/1.
 */
public class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;
    public Facade(){
        one=new SubSystemOne();
        two=new SubSystemTwo();
        three=new SubSystemThree();
        four=new SubSystemFour();
    }

    public void methodA(){
        System.out.println("操作一");
        one.methodOne();
        three.methodThree();
    }
    public void methodB(){
        System.out.println("操作二");
        two.methodTwo();
        four.methodFour();
    }
}
