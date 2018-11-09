package com.youn.pattern.decorator.v2;

/**
 * @author yang.liu
 * @create 2018/11/8
 * @Description
 **/

public class Battercake extends ABattercake{
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
