package com.观察者模式;

/**
 * Created by mu on 2017/10/31.
 */
public class ConcreteObserver extends Observer {
    private ConcreteSubject subject;
    private String name;
    private String objectState;


    public Subject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        objectState=subject.getState();
        System.out.println("观察者"+name+"的值为"+objectState);
    }
}
