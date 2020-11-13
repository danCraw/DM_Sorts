package com.company;

import java.util.Arrays;

public class BinaryInsertionSort implements Sort {
    int count = 0;
    private static int countWhile = 0;

    @Override
    public int[] sort(int[] arr) {
        int x;
        int left;
        int right;
        //count ++;
        for (int i = 1; i < arr.length; i++) {
            //count++;
            if (arr[i - 1] > arr[i]) {
                count++;
                x = arr[i];
                left = 0;
                right = i - 1;
                do {
                    count++;
                    int mid = (left + right) / 2;
                    if (arr[mid] < x) left = mid + 1;
                    else right = mid - 1;
                } while (left <= right);
                for (int j = i - 1; j >= left; j--) {
                    //count++;
                    countWhile++;
                    arr[j + 1] = arr[j];
                }
                arr[left] = x;
            }
        }
        if (countWhile <= 0){
            count = arr.length - 1;
        }
        System.out.println(count);
        return arr;
    }
}