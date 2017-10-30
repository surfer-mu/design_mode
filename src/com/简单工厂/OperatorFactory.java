package com.简单工厂;

/**
 * Created by mu on 2017/9/16.
 */
public class OperatorFactory {
    public static Operator createOperator(String operate){
        Operator oper=null;
        switch(operate){
            case "+":
                oper=new AddOperator();
                break;
            case "*":
                oper=new MultiplyOperator();
                break;
        }
        return oper;
    }
}
