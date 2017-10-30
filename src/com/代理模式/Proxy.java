package com.代理模式;

/**
 * Created by mu on 2017/9/25.
 */
public class Proxy implements Subject {
    private Subject subject;

    @Override
    public void request() {
        if(subject==null){
            subject=new RealSubject();
        }
        subject.request();
    }
}
