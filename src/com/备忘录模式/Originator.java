package com.备忘录模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }
    public void setMemento(Memento memento){
        state=memento.getStatus();
    }
    public void show(){
        System.out.println("我的状态："+state);
    }
}
