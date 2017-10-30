package com.策略模式;

/**
 * Created by mu on 2017/9/16.
 */
public class Client {
    public static void main(String[] args) {
        Plane plane=null;
        String str="快飞机";
        switch(str){
            case "快飞机":
                plane=new Plane(new ConcreteDistanceA(),new ConcreteFlyA());
                break;
            case "烂飞机":
                plane=new Plane(new ConcreteDistanceB(),new ConcreteFlyA());
                break;
        }
        plane.fly();
        plane.distance();

    }
}
