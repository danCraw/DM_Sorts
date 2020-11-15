package com.company;

public class ShellSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int k = 0;
        int step = arr.length / 2;
        while (step >= 1) {
            for (int i = 0; i < arr.length; i++) {
                k++;
                for (int j = i - step; j >= 0; j -= step) {
                    if (arr[j] > arr[j + step]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + step];
                        arr[j + step] = tmp;
                    }
                }
            }
            step = step / 2;
        }
        System.out.println(k);
        return arr;
    }
}
