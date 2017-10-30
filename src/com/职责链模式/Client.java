package com.职责链模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Client {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 8, 12,18};
        ConcreteHandlerA concreteHandlerA = new ConcreteHandlerA();
        ConcreteHandlerB concreteHandlerB = new ConcreteHandlerB();
        ConcreteHandlerC concreteHandlerC = new ConcreteHandlerC();
        concreteHandlerA.setHandler(concreteHandlerB);
        concreteHandlerB.setHandler(concreteHandlerC);
        for (int value : arr
                ) {
            concreteHandlerA.HandlerRequest(value);
        }
    }
}
