package com.策略模式;

/**
 * Created by mu on 2017/9/16.
 */
public class ConcreteDistanceA implements DistanceBehavior {
    @Override
    public void distance() {
        System.out.println("飞得远");
    }
}
