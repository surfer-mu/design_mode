package com.单例模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if(instance==null){
            synchronized (Singleton1.class){
                if (instance==null){
                    instance=new Singleton1();
                }
            }
        }
        return instance;
    }
}
