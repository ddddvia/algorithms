package com.ddddvia.algorithms.mergesort;

import static com.ddddvia.algorithms.utils.ToolUtils.print;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 3, 6, 8, 9};
        sort(arr, 0, arr.length - 1);
        print(arr);
    }

    //递归过程
    public static void sort(int[] arr, int left, int right) {
        if (left == right)
            return;
        int mid = left + (right - left) / 2;
        //对左边排序
        sort(arr, left, mid);
        //对右边排序
        sort(arr, mid + 1, right);
        //排序归并
        merge(arr, left, right, mid+1);
    }

    //排序归并
    public static void merge(int[] arr, int left, int right, int mid) {
        if (left == right)
            return;
        int i = left;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right ) {
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while ( j <=right)temp[k++] = arr[j++];
        while (i <= mid) temp[k++] = arr[i++];
        for (int t = 0; t < temp.length; t++) {
            arr[left + t] = temp[t];
        }
    }

}
