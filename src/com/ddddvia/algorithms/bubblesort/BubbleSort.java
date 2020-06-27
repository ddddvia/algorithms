package com.ddddvia.algorithms.bubblesort;


import static com.ddddvia.algorithms.utils.ToolUtils.print;

/**
 * 冒泡排序
 *
 * @Author: hedwf
 * @Date: 2020.06.27
 * @Version: 1.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 5, 1, 8, 5, 6, 4};
        sort(arr);
        print(arr);
    }

    /**
     * 冒泡排序
     *
     * @param arr 数组
     */
    private static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            findMax(arr, i);
        }
    }

    /**
     * 找到最大的数
     *
     * @param arr 数组
     * @param i   下标
     */
    private static void findMax(int[] arr, int i) {
        for (int j = 0; j < i; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j);
            }
        }
    }

    /**
     * 交换数值
     *
     * @param arr 数组
     * @param j   下标
     */
    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }

}
