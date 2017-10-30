package com.建造者模式;

/**
 * Created by mu on 2017/10/1.
 */
public class ProductBuilderA implements Builer {
    private Product product;
    public ProductBuilderA(){
        product=new Product();
    }

    @Override
    public void buildPartA() {
        product.add("APartA");
    }

    @Override
    public void buildPartB() {
        product.add("APartB");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
