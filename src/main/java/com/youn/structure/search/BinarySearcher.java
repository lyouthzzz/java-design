package com.youn.structure.search;

/**
 * @author yang.liu
 * @create 2018/12/3
 * @Description: 二分查找
 **/

public class BinarySearcher {

    private BinarySearcher() {
    }

    /**
     * 非递归查找
     *
     * @param a     在数组中查找
     * @param n     数组的长度
     * @param value 需要查找的值
     * @return
     */
    public static int nonRecursSearch(int[] a, int n, int value) {
        int lowIndex = 0;
        int highIndex = n - 1;
        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) >> 1;
            if (a[midIndex] == value) {
                return midIndex;
            } else if (value > a[midIndex]) {
                lowIndex = midIndex + 1;
            } else if (value < a[midIndex]) {
                highIndex = midIndex - 1;
            }
        }
        return -1;
    }

    /**
     * 递归二分查找
     *
     * @param a
     * @param lowIndex
     * @param highIndex
     * @param value
     * @return
     */
    public static int recursSearch(int[] a, int lowIndex, int highIndex, int value) {
        if (lowIndex > highIndex) return -1;
        int midIndex = (lowIndex + highIndex) >> 1;
        if (value > a[midIndex]) {
            return recursSearch(a, midIndex + 1, highIndex, value);
        } else if (value < a[midIndex]) {
            return recursSearch(a, lowIndex, midIndex - 1, value);
        } else {
            return midIndex;
        }
    }


    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        int value = 8;
        System.out.println(nonRecursSearch(a, a.length, value));
        System.out.println(recursSearch(a, 0, a.length - 1, value));
    }
}
