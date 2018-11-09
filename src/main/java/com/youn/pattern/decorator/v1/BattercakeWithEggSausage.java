package com.youn.pattern.decorator.v1;

/**
 * @author yang.liu
 * @create 2018/11/8
 * @Description
 **/

public class BattercakeWithEggSausage extends BattercakeWithEgg{

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
