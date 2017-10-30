package com.桥接模式;

/**
 * Created by mu on 2017/10/18.
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operator() {
        System.out.println("abs");
        implementor.operatorImp();
    }
}
