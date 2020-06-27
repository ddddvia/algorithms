package com.ddddvia.algorithms.main;



import static com.ddddvia.algorithms.utils.ToolUtils.print;
import static com.ddddvia.algorithms.utils.ToolUtils.swap;

/**
 * 冒泡排序
 *
 * @Author: hedwf
 * @Date: 2020.06.27
 * @Version: 1.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6,2,9,5,1,8,5,6,4};
        sort(arr);
        print(arr);
    }

    /**
     * 冒泡排序
     *
     * @param arr 数组
     */
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int maxPosition = 0;
            for(int j=1;j<arr.length;j++){
                if(arr[maxPosition]>arr[j]){
                    swap(arr,maxPosition,j);
                }
                maxPosition=j;
            }
        }
    }

}
