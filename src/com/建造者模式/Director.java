package com.建造者模式;

/**
 * Created by mu on 2017/10/1.
 */
public class Director {

    public void build(Builer builer){
        System.out.println("开始建造");
        builer.buildPartA();
        builer.buildPartB();
    }
}
