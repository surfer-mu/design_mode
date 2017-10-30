package com.中介者模式;

/**
 * Created by mu on 2017/10/19.
 */
public abstract class Mediator {
    protected Colleague colleague1;
    protected Colleague colleague2;
    protected Colleague colleague3;

    public void setColleague3(Colleague colleague3) {
        this.colleague3 = colleague3;
    }

    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    public abstract void send(String message, Colleague colleague);
}
