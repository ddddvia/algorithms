package com.ddddvia.algorithms.selectionsort;

/**
 * 选择排序：时间复杂度O(n^2)
 * @Author: hedwf
 * @Date: 2020.06.27
 * @Version: 1.0
 */
public class SelectionSort {
    /**
     * 函数入口
     *
     * @param args 入参
     */
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 9, 3, 7, 1, 9};
        for (int i = 0; i < arr.length; i++) {
            int minPosition = i;
            // 主要的时间复杂度地方
            for (int j = i + 1; j < arr.length; j++) {
                minPosition = arr[j] < arr[minPosition] ? j : minPosition;
            }
            swap(arr, i, minPosition);
            print(arr);
        }
        print(arr);
    }

    /**
     * 交换值
     *
     * @param arr    数组
     * @param source 源值
     * @param target 目标最小值
     */
    static void swap(int[] arr, int source, int target) {
        int temp = arr[source];
        arr[source] = arr[target];
        arr[target] = temp;
    }

    /**
     * 输出函数
     *
     * @param arr 入参
     */
    static void print(int[] arr) {
        for (int attr : arr) {
            System.out.print(attr + ",");
        }
        System.out.println();
    }

}
