package com.工厂模式;

/**
 * Created by mu on 2017/10/1.
 */
public class GraduateFactory implements IFactory {
    @Override
    public LeiFeng CreateLeiFeng() {

        return new Graduate();
    }
}
