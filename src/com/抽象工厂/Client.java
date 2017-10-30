package com.抽象工厂;

/**
 * Created by mu on 2017/10/1.
 */
public class Client {
    public static void main(String[] args) {
        /*
        * 只需修改此处
        * */
        IFactory factory=new ConcreteFactoryAccess();
        IDepartment department = factory.createDepartment();
        department.insertDepartment();
        department.selectDepartment();

    }
}
