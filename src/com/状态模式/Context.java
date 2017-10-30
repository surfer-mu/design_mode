package com.状态模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Context {
    private boolean FINISH;
    private int hour;
    private State state;

    public Context() {
        state=new Morning();
    }

    public void writeProgram(){
        state.writeProgram(this);
    }
    public boolean getFINISH() {
        return FINISH;
    }

    public void setFINISH(boolean FINISH) {
        this.FINISH = FINISH;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
