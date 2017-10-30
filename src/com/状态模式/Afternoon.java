package com.状态模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Afternoon implements State {
    @Override
    public void writeProgram(Context context) {
        if(!context.getFINISH()){
            System.out.println("好困想睡觉");
        }
        else{
            context.setState(new Sleeping());
            context.writeProgram();
        }
    }
}
