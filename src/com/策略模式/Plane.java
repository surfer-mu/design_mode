package com.策略模式;

/**
 * Created by mu on 2017/9/16.
 */
public class Plane {
    private DistanceBehavior distanceBehavior;
    private FlyBebavior flyBebavior;

    public Plane(DistanceBehavior distanceBehavior, FlyBebavior flyBebavior) {
        this.distanceBehavior = distanceBehavior;
        this.flyBebavior = flyBebavior;
    }
    public void distance(){
        distanceBehavior.distance();
    }
    public void fly(){
        flyBebavior.fly();
    }
}
