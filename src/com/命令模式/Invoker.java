package com.命令模式;

import java.util.LinkedList;

/**
 * Created by mu on 2017/10/18.
 */
public class Invoker {
    private Command command;
    //private LinkedList<Command> list=new LinkedList<Command>(); //可变为命令队列

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
    }
}
