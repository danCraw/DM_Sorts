package com.company;

import java.util.Arrays;

public class BinaryInsertionSort implements Sort {
    int c = 0;
    private static int countWhile = 0;

    @Override
    public int[] sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int index;
//            c+= BS.bs(arr, newElement);
            index = Arrays.binarySearch(arr, 0, k, newElement);
            if (index < 0) {
                index = -(index) - 1;
//                c++;
            }
            c++;
            System.arraycopy(arr, index, arr, index + 1, k - index);
            arr[index] = newElement;
        }
        System.out.println(c);
        return arr;
    }
}