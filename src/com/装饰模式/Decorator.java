package com.装饰模式;

/**
 * Created by mu on 2017/9/16.
 */
public class Decorator extends Person {
    protected Person person;

    public Decorator(Person person) {
       this.person=person;
    }


    @Override
    public void show() {

        if(person!=null){
            person.show();
        }

    }
}
