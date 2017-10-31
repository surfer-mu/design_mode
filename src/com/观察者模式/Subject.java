package com.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mu on 2017/10/31.
 */
public abstract class Subject {
    private List<Observer> list=new ArrayList<>();
    public void Add(Observer observer){
        list.add(observer);
    }
    public void remove(Observer observer){
        list.remove(observer);
    }
    public void Notify(){
        for (Observer observer:list
             ) {
            observer.update();
        }
    }
}
