package com.company;

import java.util.Arrays;

public class MergeSort implements Sort {
    static int k = 0;

    @Override
    public  int[] sort(int[] arr) {
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = new int[arr.length];
        int[] result = mergeSortInner(arr1, arr2, 0, arr.length);
        System.out.println(k);
        return result;
    }

    public static int[] mergeSortInner(int[] arr1, int[] arr2, int startIndex, int endIndex) {

        if (startIndex >= endIndex - 1) {
            return arr1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(arr1, arr2, startIndex, middle);
        int[] sorted2 = mergeSortInner(arr1, arr2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == arr1 ? arr2 : arr1;
        while (index1 < middle && index2 < endIndex) {
            k++;
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            k++;
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            k++;
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
