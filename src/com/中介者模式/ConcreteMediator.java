package com.中介者模式;

/**
 * Created by mu on 2017/10/19.
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void send(String message, Colleague colleague) {
        if(colleague==colleague1){
            colleague2.notify(message);
        }
        else if(colleague==colleague2){
            colleague3.notify(message);
        }
        else{
            colleague1.notify(message);
        }
    }
}
