package com.中介者模式;

/**
 * Created by mu on 2017/10/19.
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("A 收到 "+message);
    }
}
