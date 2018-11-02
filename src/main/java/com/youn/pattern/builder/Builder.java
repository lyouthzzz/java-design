package com.youn.pattern.builder;

/**
 * @author yang.liu
 * @create 2018/11/2
 * @Description
 **/

public abstract class Builder {
    public abstract void buildCPU(String cpu);
    public abstract void buildMainBoard(String mainBoard);
    public abstract void buildHardDisk(String hardDisk);
    public abstract void buildDisplayCard(String displayCard);
    public abstract void buildPower(String power);
    public abstract void buildMemory(String memory);

    public abstract Computer createComputer();
}
