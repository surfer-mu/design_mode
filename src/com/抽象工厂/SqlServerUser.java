package com.抽象工厂;

/**
 * Created by mu on 2017/10/1.
 */
public class SqlServerUser implements IUser {
    @Override
    public void selectUser() {
        System.out.println("SqlServerUser_Select");
    }

    @Override
    public void insertUser() {
        System.out.println("SqlServerUser_Insert");
    }
}
