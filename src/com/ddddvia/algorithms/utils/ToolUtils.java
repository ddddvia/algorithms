package com.ddddvia.algorithms.utils;

/**
 * @Author: hedwf
 * @Date: 2020.06.27
 * @Version: 1.0
 */
public class ToolUtils {
    /**
     * 输出函数
     *
     * @param arr 入参
     */
    public static void print(int[] arr) {
        for (int attr : arr) {
            System.out.print(attr + " ");
        }
        System.out.println();
    }

    /**
     * 交换值
     *
     * @param arr    数组
     * @param source 源值
     * @param target 目标最小值
     */
    public static void swap(int[] arr, int source, int target) {
        int temp = arr[source];
        arr[source] = arr[target];
        arr[target] = temp;
    }
}
