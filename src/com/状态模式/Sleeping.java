package com.状态模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Sleeping implements State {
    @Override
    public void writeProgram(Context context) {
        System.out.println("完成了，睡着了");
    }
}
