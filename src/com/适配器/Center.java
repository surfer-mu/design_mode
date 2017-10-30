package com.适配器;

/**
 * Created by mu on 2017/10/2.
 */
public  class Center extends Player {


    public Center(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("中路进攻");
    }

    @Override
    public void Defense() {
        System.out.println("中路进攻");
    }
}
