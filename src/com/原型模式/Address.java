package com.原型模式;

/**
 * Created by mu on 2017/10/31.
 */
public class Address implements Cloneable {
    private String province;

    public Address(String province) {
        this.province = province;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address)super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
