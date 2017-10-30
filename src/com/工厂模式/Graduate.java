package com.工厂模式;

/**
 * Created by mu on 2017/9/30.
 */
public class Graduate implements LeiFeng {
    @Override
    public void sweep() {
        System.out.println("学生扫地");
    }

    @Override
    public void wash() {
        System.out.println("学生刷碗");
    }

    @Override
    public void buyRice() {
        System.out.println("学生洗米");
    }
}
