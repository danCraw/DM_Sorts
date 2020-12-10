package com.company;

import java.util.Arrays;

public class QuickSort {
    static int k = 0;
    public int[] sort(int[] arr, int from, int to) {
        if (from < to) {

            int divideIndex = partition(arr, from, to);

            sort(arr, from, divideIndex - 1);

            sort(arr, divideIndex, to);

        }
        System.out.println(k);
        return arr;
    }

    private static int partition(int[] arr, int from, int to) {

        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];

        while (leftIndex <= rightIndex) {
        k++;
            while (arr[leftIndex] < pivot) {
                k++;
                leftIndex++;
            }
        k++;
            while (arr[rightIndex] > pivot) {
                k++;
                rightIndex--;
            }
        k++;
            if (leftIndex <= rightIndex) {
                k++;
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        k++;
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

}