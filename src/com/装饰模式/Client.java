package com.装饰模式;

/**
 * Created by mu on 2017/9/16.
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person("二狗子");
        TShirt tShirt = new TShirt(person);
        Cloths cloths = new Cloths(tShirt);
        cloths.show();

    }
}
