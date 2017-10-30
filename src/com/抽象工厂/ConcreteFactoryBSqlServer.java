package com.抽象工厂;

/**
 * Created by mu on 2017/10/1.
 */
public class ConcreteFactoryBSqlServer implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
