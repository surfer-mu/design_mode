package com.抽象工厂;

/**
 * Created by mu on 2017/10/1.
 */
public class ConcreteFactoryAccess implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
