package com.观察者模式;

/**
 * Created by mu on 2017/10/31.
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
