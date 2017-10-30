package com.单例模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Singleton3 {
    private static Singleton3 instance=new Singleton3();
    private Singleton3(){
    }
    public static Singleton3 getInstance(){
        return instance;
    }
}
