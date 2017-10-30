package com.组合模式;

/**
 * Created by mu on 2017/10/18.
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display();
}
