package com.建造者模式;

/**
 * Created by mu on 2017/10/1.
 */
public class ProductBuilderB implements Builer {
    private Product product;
    public ProductBuilderB(){
        product=new Product();
    }
    @Override
    public void buildPartA() {
        product.add("BPartA");
    }

    @Override
    public void buildPartB() {
        product.add("BPartA");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
