package com.组合模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Client {
    public static void main(String[] args) {
        Composite composite = new Composite("root");
        composite.add(new Leaf("1 leaf  A"));
        composite.add(new Leaf("1 leaf B"));
        Composite composite1=new Composite("1 Composite");
        composite.add(composite1);
        composite1.add(new Leaf("2 leaf A"));
        composite1.add(new Leaf("2 leaf B"));
        composite.display();

    }
}
