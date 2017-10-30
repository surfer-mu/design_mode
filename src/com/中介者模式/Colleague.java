package com.中介者模式;

/**
 * Created by mu on 2017/10/19.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    public void send(String massage){
        mediator.send(massage,this);
    }
    public abstract void notify(String message);
}
