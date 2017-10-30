package com.命令模式;

/**
 * Created by mu on 2017/10/18.
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("通知命令");
        receiver.action();
    }
}
