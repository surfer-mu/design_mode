package com.抽象工厂;

/**
 * Created by mu on 2017/10/1.
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void selectDepartment() {
        System.out.println("SqlServerDepartment_select");
    }

    @Override
    public void insertDepartment() {
        System.out.println("SqlServerDepartment_insert");
    }
}
