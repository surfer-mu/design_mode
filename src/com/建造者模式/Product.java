package com.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mu on 2017/10/1.
 */
public class Product {
    private List<String> list=new ArrayList<String>();
    public void add(String part){
        list.add(part);
    }
    public void showProduct(){
        System.out.println("展示商品");
        System.out.println(list);
    }

}
