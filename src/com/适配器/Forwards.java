package com.适配器;

/**
 * Created by mu on 2017/10/2.
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("上路进攻");
    }

    @Override
    public void Defense() {
        System.out.println("上路防守");
    }
}
