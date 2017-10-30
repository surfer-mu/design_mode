package com.桥接模式;

/**
 * Created by mu on 2017/10/18.
 */
public  abstract class Abstraction {
    protected Implementor implementor;
    public abstract void operator();

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}
