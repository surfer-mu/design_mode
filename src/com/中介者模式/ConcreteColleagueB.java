package com.中介者模式;

/**
 * Created by mu on 2017/10/19.
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("B 收到 "+message);
    }
}
