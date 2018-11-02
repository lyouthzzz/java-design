package com.youn.pattern.builder.v2;

/**
 * @author yang.liu
 * @create 2018/11/2
 * @Description
 **/

public class Test {
    @org.junit.Test
    public void test(){
        Computer computer = new Computer.ComputerBuilder().buildCPU("酷睿I7").buildDisplayCard("英伟达显卡").build();
        System.out.println(computer);
    }
}
