package com.职责链模式;

/**
 * Created by mu on 2017/10/18.
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void HandlerRequest(int request) {
        if(request<5){
            System.out.println("A yes");
        }
        else{
            if(handler!=null){
                handler.HandlerRequest(request);
            }
        }
    }
}
