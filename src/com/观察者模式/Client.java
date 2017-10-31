package com.观察者模式;

/**
 * Created by mu on 2017/10/31.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();
        subject.Add(new ConcreteObserver(subject,"A"));
        subject.Add(new ConcreteObserver(subject,"B"));
        subject.Add(new ConcreteObserver(subject,"C"));

        subject.Notify();

        subject.setState("haha");
        subject.Notify();
    }
}
