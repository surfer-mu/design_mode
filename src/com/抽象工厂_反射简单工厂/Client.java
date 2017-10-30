package com.抽象工厂_反射简单工厂;

import java.util.Date;

/**
 * Created by mu on 2017/10/1.
 */
public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        DataAccess dataAccess = new DataAccess();
        IDepartment user = dataAccess.createUser();
        user.insertDepartment();
        user.selectDepartment();
    }
}
