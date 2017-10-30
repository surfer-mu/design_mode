package com.适配器;

/**
 * Created by mu on 2017/10/2.
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }
    public abstract void Attack();
    public abstract void Defense();
}
