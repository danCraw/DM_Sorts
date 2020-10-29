package com.company;

import java.util.Arrays;

public class BinaryInsertionSort implements Sort {
    @Override
    public int[] sort (int[] arr) {
        int k = 0;
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int index;
            k += BinarySearch.binarySearch(arr, value);
            index = Arrays.binarySearch(arr, 0, left, value);
            if (index < 0) {
                index = -(index) - 1;
            }
            System.arraycopy(arr, index, arr, index + 1, left - index);
            arr[index] = value;
        }
        System.out.println(k);
        return arr;
    }
}