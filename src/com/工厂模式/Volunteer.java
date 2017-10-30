package com.工厂模式;

/**
 * Created by mu on 2017/9/30.
 */
public class Volunteer implements LeiFeng {
    @Override
    public void sweep() {
        System.out.println("社区扫地");
    }

    @Override
    public void wash() {
        System.out.println("社区刷碗");
    }

    @Override
    public void buyRice() {
        System.out.println("社区洗米");
    }
}
