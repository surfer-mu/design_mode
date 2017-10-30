package com.职责链模式;

/**
 * Created by mu on 2017/10/18.
 */
public class ConcreteHandlerB extends Handler {
    @Override
    public void HandlerRequest(int request) {
        if(request<10){
            System.out.println("B yes");
        }
        else{
            if(handler!=null){
                handler.HandlerRequest(request);
            }
        }
    }
}
