package com.简单工厂;

/**
 * Created by mu on 2017/9/16.
 */
public class Client {
    public static void main(String[] args) {
        Operator operator=OperatorFactory.createOperator("+");
        operator.calculate();

    }
}
