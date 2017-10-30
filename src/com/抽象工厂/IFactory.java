package com.抽象工厂;

/**
 * Created by mu on 2017/10/1.
 */
public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}
