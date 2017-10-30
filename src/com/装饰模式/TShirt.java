package com.装饰模式;

/**
 * Created by mu on 2017/9/16.
 */
public class TShirt extends Decorator {
    private Person person;
    public TShirt(Person person) {
        super(person);
        this.person=person;
    }

    @Override
    public void show() {
        System.out.println("穿裤子");
        person.show();
    }
}
