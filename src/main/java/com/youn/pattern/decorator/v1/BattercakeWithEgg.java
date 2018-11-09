package com.youn.pattern.decorator.v1;

/**
 * @author yang.liu
 * @create 2018/11/8
 * @Description
 **/

public class BattercakeWithEgg extends Battercake{
    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
