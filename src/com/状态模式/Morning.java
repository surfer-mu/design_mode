package com.状态模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Morning implements State {
    @Override
    public void writeProgram(Context context) {
        if(context.getHour()<12){
            System.out.println("早上精力充沛");
        }
        else{
            context.setState(new Afternoon());
            context.writeProgram();
        }
    }
}
