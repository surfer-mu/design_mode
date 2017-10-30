package com.抽象工厂_反射简单工厂;

import java.util.ResourceBundle;

/**
 * Created by mu on 2017/10/1.
 */
public class DataAccess {
    private String PACKAGEINFO="com.抽象工厂_反射简单工厂";
    private String DB= ResourceBundle.getBundle("com.抽象工厂_反射简单工厂.info").getString("DB");
    private IUser creatUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IUser) Class.forName(PACKAGEINFO+"."+DB+"User").newInstance();
    }
    public IDepartment createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (IDepartment)Class.forName(PACKAGEINFO+"."+DB+"Department").newInstance();
    }

}
