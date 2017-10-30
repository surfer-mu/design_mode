package com.命令模式;

/**
 * Created by mu on 2017/10/18.
 */
public  abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
