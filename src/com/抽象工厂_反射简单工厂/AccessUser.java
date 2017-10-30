package com.抽象工厂_反射简单工厂;

/**
 * Created by mu on 2017/10/1.
 */
public class AccessUser implements IUser {
    @Override
    public void selectUser() {
        System.out.println("AccessUser_select");
    }

    @Override
    public void insertUser() {
        System.out.println("AccessUser_insert");
    }
}
