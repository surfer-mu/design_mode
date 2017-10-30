package com.组合模式;

/**
 * Created by mu on 2017/10/18.
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void display() {
        System.out.println(name);
    }
}
