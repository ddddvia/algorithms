package com.ddddvia.algorithms.utils;

import com.ddddvia.algorithms.bubblesort.BubbleSort;
import com.ddddvia.algorithms.insertionsort.InsertionSort;
import com.ddddvia.algorithms.mergesort.MergeSort;
import com.ddddvia.algorithms.quicksort.QuickSort;
import com.ddddvia.algorithms.selectionsort.SelectionSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 对数检查器
 */
public class DataChecker {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("【1】选择排序");
        System.out.println("【2】冒泡排序");
        System.out.println("【3】插入排序");
        System.out.println("【4】归并排序");
        System.out.println("【5】快速排序");
        System.out.println("【0】退出");
        System.out.println();
        System.out.print("请输入您的算法序号：");
        int algorithmNum = scanner.nextInt();
        while (algorithmNum!=0) {
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                boolean same = check(algorithmNum);
                if (!same) {
                    System.out.println("wrong");
                    return;
                }
            }
            System.out.println("right");
            long endTime = System.currentTimeMillis();
            System.out.println("程序运行时间：" + (endTime - startTime) / 1000.0 + "s");
            System.out.println();
            System.out.print("请输入您的算法序号：");
            algorithmNum = scanner.nextInt();
        }
        System.out.println("退出");
    }

    /**
     * 产生随机数组
     *
     * @return 产生随机数组
     */
    private static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    /**
     * 比较算法正确性
     */
    private static boolean check(int algorithmNum) {
        int[] arr = generateRandomArray();
        int[] arrCopy = new int[arr.length];

        //复制数组
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        Arrays.sort(arr);

        switch (algorithmNum){
            case 1:
                SelectionSort.sort(arrCopy);
            case 2:
                BubbleSort.sort(arrCopy);
            case 3:
                InsertionSort.sort(arrCopy);
            case 4:
                MergeSort.sort(arrCopy,0,arrCopy.length-1);
            case 5:
                QuickSort.sort(arrCopy,0,arrCopy.length-1);
            default:
                Arrays.sort(arrCopy);
        }

        //检查算法正确性
        boolean same;
        for (int i = 0; i < arrCopy.length; i++) {
            same = (arr[i] == arrCopy[i]);
            if (!same) {
                return false;
            }
        }
        return true;
    }
}
