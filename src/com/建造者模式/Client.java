package com.建造者模式;

/**
 * Created by mu on 2017/10/1.
 */
public class Client {
    public static void main(String[] args) {
        Builer builer1=new ProductBuilderA();
        Builer builer2=new ProductBuilderB();
        Director director=new Director();

        director.build(builer1);
        Product product1 = builer1.getResult();
        product1.showProduct();

        director.build(builer2);
        Product product2 = builer2.getResult();
        product2.showProduct();
    }
}
