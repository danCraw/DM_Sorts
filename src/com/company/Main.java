package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();
        int arrSize = 100;
        int[] arr = worstCase(arrSize);
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Отсортированный массив: ");
//        System.out.println(Arrays.toString(insertionSort.sort(arr)));
        System.out.println(Arrays.toString(binaryInsertionSort.sort(arr)));
    }

    private static int[] worstCase(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        return arr;
    }

    private static int[] bestCase(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    private static int[] middleCase(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Random.interval(0, 100);
        }
        return arr;
    }
}
