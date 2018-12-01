package com.youn.structure.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:youn
 * Date: 2018/12/01
 * Desc:
 */

public class BaseArray {
    // 存储数组
    public int data[];
    // 数组长度
    public int size;
    // array存储元素数量
    public int count;

    public BaseArray(int capacity) {
        this.data = new int[capacity];
        this.size = capacity;
        this.count = 0;
    }

    public BaseArray() {
        this(8);
    }

    /**
     * 查找元素
     *
     * @param index
     * @return
     */
    public int get(int index) {
        if (index < 0 || index > count) {
            System.out.println("位置不合法");
            return -1;
        }
        return data[index];
    }

    /**
     * 插入元素
     *
     * @param index
     * @param value
     * @return
     */
    public boolean insert(int index, int value) {
        if (count == size) {
            System.out.println("数组空间已满");
            return false;
        }
        if (index < 0 || index > count) {
            System.out.println("位置不合法");
            return false;
        }
        // 数组元素向后搬运
        for (int i = count; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        ++count;
        return true;
    }

    /**
     * 从数组尾巴添加元素
     *
     * @param value
     * @return
     */
    public boolean add(int value) {
        if (size == count) {
            System.out.println("存储空间已满");
            return false;
        }
        data[count++] = value;
        return true;
    }

    /**
     * index元素赋值
     *
     * @param index
     * @param value
     * @return
     */
    public boolean set(int index, int value) {
        if (index < 0 || index > count) {
            System.out.println("位置不合法");
            return false;
        }
        data[index] = value;
        return true;
    }

    /**
     * 删除元素
     *
     * @param index
     * @return
     */
    public boolean delete(int index) {
        if (index < 0 || index > count) {
            System.out.println("位置不合法");
            return false;
        }
        for (int i = index; i < count; i++) {
            data[i] = data[i + 1];
        }
        --count;
        return true;
    }

    /**
     * 打印数组
     */
    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(String.format("index %d is %d", i, data[i]));
        }
    }

    public static void main(String[] args) {
        BaseArray array = new BaseArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.insert(1,1);
        array.set(1,11);
        array.printAll();
    }
}
