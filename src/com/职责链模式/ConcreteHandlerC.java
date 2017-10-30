package com.职责链模式;

/**
 * Created by mu on 2017/10/18.
 */
public class ConcreteHandlerC extends Handler {
    @Override
    public void HandlerRequest(int request) {
        if(request<15){
            System.out.println("C yes");
        }
        else{
            if(handler!=null){
                handler.HandlerRequest(request);
            }
        }
    }
}
