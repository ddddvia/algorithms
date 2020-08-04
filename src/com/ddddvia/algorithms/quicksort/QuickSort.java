package com.ddddvia.algorithms.quicksort;

import static com.ddddvia.algorithms.utils.ToolUtils.print;
import static com.ddddvia.algorithms.utils.ToolUtils.swap;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {0, 6, 2, 5, 7, 10, 5, 6, 9, 2, 10};
        sort(arr, 0, arr.length - 1);
        print(arr);
    }

    //进行排序算法
    public static void sort(int[] arr, int left, int right) {
        if (left >= right) return;
        //得到标杆位置
        int flag = parition(arr, left, right);
        //左排序
        sort(arr, left, flag - 1);
        //右排序
        sort(arr, flag + 1, right);
    }

    /**
     * @param arr   数组
     * @param left  左边界
     * @param right 右边界
     * @return 返回中轴值
     */
    public static int parition(int[] arr, int left, int right) {
        int i = left;
        int j = right - 1;
        while (i <= j) {
            while (i <= j && arr[i] <= arr[right]) i++;
            while (i <= j && arr[j] > arr[right]) j--;
            if (i < j) swap(arr, i, j);

        }
        swap(arr, i, right);
        return i;
    }
}
