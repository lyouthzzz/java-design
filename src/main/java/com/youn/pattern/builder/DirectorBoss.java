package com.youn.pattern.builder;

/**
 * @author yang.liu
 * @create 2018/11/2
 * @Description: 建造者
 **/

public class DirectorBoss {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Computer createComputer(String cpu, String mainBord,
                                   String hardDisk, String displayCard,
                                   String power, String memory){
        this.builder.buildCPU(cpu);
        this.builder.buildMainBoard(mainBord);
        this.builder.buildHardDisk(hardDisk);
        this.builder.buildDisplayCard(displayCard);
        this.builder.buildPower(power);
        this.builder.buildMemory(memory);
        return this.builder.createComputer();
    }
}
