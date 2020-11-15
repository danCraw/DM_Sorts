package com.company;

public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int k = 0;
        // i - номер прохода
        for (int i = 0; i < arr.length; i++) {
            // внутренний цикл прохода
            for (int j = arr.length - 1; j > i; j--) {
                k++;
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(k);
        return arr;
    }
}
