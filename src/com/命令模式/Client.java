package com.命令模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Client {
    public static void main(String[] args) {
        Command command=new ConcreteCommand(new Receiver());
        Invoker invoker=new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
