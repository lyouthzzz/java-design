package com.youn.pattern.builder;

/**
 * @author yang.liu
 * @create 2018/11/2
 * @Description
 **/

public class Test {
    @org.junit.Test
    public void test(){
        Builder builder = new ComputerBuilder();
        DirectorBoss boss = new DirectorBoss();
        boss.setBuilder(builder);
        Computer computer = boss.createComputer("酷睿I7","华硕主板","希捷2T硬盘","英伟达显卡","长城电源","威刚内存条8G");
        System.out.println(computer.toString());
    }
    @org.junit.Test
    public void test2(){
        Builder builder = new ComputerBuilder();
        builder.buildCPU("酷睿I7");
        builder.buildMainBoard("华硕主板");
        builder.buildHardDisk("希捷2T硬盘");
        builder.buildPower("长城电源");
        builder.buildDisplayCard("英伟达显卡");
        builder.buildMemory("威刚内存条8G");
        Computer computer = builder.createComputer();
        System.out.println(computer);
    }

}
