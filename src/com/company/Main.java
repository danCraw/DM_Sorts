package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();
        BubbleSort bubbleSort = new BubbleSort();
        ShellSort shellSort = new ShellSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        int arrSize = 15;
        int[] arr = ordered(arrSize);

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Отсортированный массив: ");
//        System.out.println(Arrays.toString(insertionSort.sort(arr)));
//        System.out.println(Arrays.toString(binaryInsertionSort.sort(arr)));
//        System.out.println(Arrays.toString(bubbleSort.sort(arr)));
//       System.out.println(Arrays.toString(shellSort.sort(arr)));
        System.out.println(Arrays.toString(quickSort.sort(arr, arrSize / 2, arr.length - 1)));
//        System.out.println(Arrays.toString(mergeSort.sort(arr)));
    }

    private static int[] reverseOrdered(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        return arr;
    }

    private static int[] ordered(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    private static int[] random(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Random.interval(0, 100);
        }
        return arr;
    }
}
