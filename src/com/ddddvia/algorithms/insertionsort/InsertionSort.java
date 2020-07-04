package com.ddddvia.algorithms.insertionsort;

import static com.ddddvia.algorithms.utils.ToolUtils.print;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,7,9,1,3,8};
        sort(arr);
        print(arr);
    }

    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int minPosition = i;
            for(int j=i-1;j>=0;j--){
                if(arr[minPosition]<arr[j]) {
                    swap(arr, minPosition, j);
                    minPosition = j;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
