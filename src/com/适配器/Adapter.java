package com.适配器;

/**
 * Created by mu on 2017/10/2.
 */
public class Adapter extends Player {
    private Adaptee adaptee=new Adaptee();;

    public Adapter(String name) {
        super(name);
        adaptee.setName(name);
    }

    @Override
    public void Attack() {
        adaptee.go();
    }

    @Override
    public void Defense() {
        adaptee.back();
    }
}
