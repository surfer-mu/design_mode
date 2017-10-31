package com.原型模式;

/**
 * Created by mu on 2017/10/31.
 */
public class Student implements Cloneable{
    private String name;
    private int age;
    private Address address;

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student clone = (Student) super.clone();
        if(address!=null){
            clone.setAddress(address.clone());
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
