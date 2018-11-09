package com.youn.pattern.decorator.v2;

/**
 * @author yang.liu
 * @create 2018/11/9
 * @Description
 **/

public class Test {
    public static void main(String[] args) {
        ABattercake battercake;
        battercake = new Battercake();
        // 加一个鸡蛋
        battercake = new EggDecorator(battercake);
        // 再加一个鸡蛋
        battercake = new EggDecorator(battercake);
        // 再加一根香肠
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getDesc() + " 销售价格" + battercake.cost());
    }
}
