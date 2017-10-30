package com.职责链模式;

/**
 * Created by mu on 2017/10/18.
 */
public abstract class Handler {
    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void HandlerRequest(int request);

}
