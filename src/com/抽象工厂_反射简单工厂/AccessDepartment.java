package com.抽象工厂_反射简单工厂;

/**
 * Created by mu on 2017/10/1.
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void selectDepartment() {
        System.out.println("AccessDepartment_select");
    }

    @Override
    public void insertDepartment() {
        System.out.println("AccessDepartment_insert");
    }
}
