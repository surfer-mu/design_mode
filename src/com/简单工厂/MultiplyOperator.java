package com.简单工厂;

/**
 * Created by mu on 2017/9/16.
 */
public class MultiplyOperator implements Operator {
    @Override
    public void calculate() {
        System.out.println("乘法运算");
    }
}
