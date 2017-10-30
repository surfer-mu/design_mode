package com.状态模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setHour(8);
        context.writeProgram();

        context.setHour(13);
        context.writeProgram();

        context.setFINISH(true);
        context.writeProgram();

    }
}
