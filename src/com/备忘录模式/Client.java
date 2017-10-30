package com.备忘录模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("one");

        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());

        originator.show();

        originator.setState("two");
        originator.show();

        originator.setMemento(careTaker.getMemento());
        originator.show();
    }
}
