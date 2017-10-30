package com.中介者模式;

/**
 * Created by mu on 2017/10/19.
 */
public class ConcreteColleagueC extends Colleague {
    public ConcreteColleagueC(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("C 收到 "+message);
    }
}
