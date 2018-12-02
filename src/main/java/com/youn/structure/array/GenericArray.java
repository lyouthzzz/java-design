package com.youn.structure.array;

/**
 * Author:youn
 * Date: 2018/12/01
 * Desc: 通用的数据Array
 */

public class GenericArray<T> {
    T[] data;
    int size;

    public GenericArray(int capacity) {
        this.data = (T[]) new Object[capacity];
        size = 0;
    }

    public GenericArray() {
        this(8);
    }

    public int getCapacity() {
        return data.length;
    }

    public int count() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public boolean contain(T e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public T get(int index) {
        checkIndex(index);
        return data[index];
    }

    public void set(int index, T value) {
        checkIndex(index);
        data[index] = value;
    }

    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 添加index数据
     *
     * @param index
     * @param value
     */
    public void add(int index, T value) {
        checkIndex(index);
        if (size == data.length) {
            resize((int) 2 * data.length);
        }
        // 数据向后搬运
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = value;
        size++;
    }

    public boolean addFirst(T value) {
        add(0, value);
        return true;
    }

    public boolean addLast(T value) {
        add(size, value);
        return true;
    }

    public boolean add(T value) {
        return addLast(value);
    }

    /**
     * 删除index数据
     *
     * @param index
     * @return
     */
    public T remove(int index) {
        checkIndexForRemove(index);
        T remVal = data[index];
        for (int i = index; i < size; i++) {
            data[index] = data[index + 1];
        }
        size--;
        data[size] = null;
        // 缩容
        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
        return remVal;
    }

    public T removeFirst() {
        return remove(0);
    }

    public T removeLast() {
        return remove(size - 1);
    }

    /**
     * 删除元素
     *
     * @param value
     */
    public void removeElement(T value) {
        int remIndex = indexOf(value);
        if (remIndex != -1) {
            remove(remIndex);
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Array Capacity:%d Size:%d [", data.length, size));
        for (int i = 0; i < size; i++) {
            // builder.append(String.valueOf(data[i]))
            builder.append(data[i]);
            if (i != size - 1) {
                builder.append(" ");
            } else {
                builder.append("]");
            }
        }
        return builder.toString();
    }

    public void resize(int capacity) {
        T[] newData = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    public void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed ! Require index >=0 and index <= size!");
        }
    }

    public void checkIndexForRemove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Remove failed ! Require index >=0 and index < size!");
        }
    }

    public static void main(String[] args) {
        GenericArray<String> genericArray = new GenericArray<String>(1);
        genericArray.add("one");
        genericArray.addFirst("one-first");
        genericArray.addLast("one-last");
        genericArray.add("two");
        genericArray.add("three");
        genericArray.add("four");
        genericArray.remove(1);
        genericArray.remove(5);
        genericArray.removeFirst();
        System.out.println(genericArray.toString());
    }

}
