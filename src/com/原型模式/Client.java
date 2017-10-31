package com.原型模式;

/**
 * Created by mu on 2017/10/31.
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setName("aa");
        student.setAge(18);
        student.setAddress(new Address("陕西"));

        System.out.println(student);
        System.out.println(student.clone());
    }
}
