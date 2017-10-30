package com.组合模式;

import java.util.LinkedList;

/**
 * Created by mu on 2017/10/18.
 */
public class Composite extends Component{
    private LinkedList<Component> list=new LinkedList<Component>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }


    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void display() {
        System.out.println(name);
        for (Component component:list
             ) {
            component.display();
        }
    }
}
