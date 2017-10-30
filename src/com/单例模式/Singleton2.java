package com.单例模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Singleton2 {
    private static class SingletonHolder{
        private static final Singleton2 instance=new Singleton2();
    }
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return SingletonHolder.instance;
    }

}
