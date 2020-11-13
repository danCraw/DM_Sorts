package com.company;

public class ShellSort implements Sort {
    private int k = 0;

    @Override
    public int[] sort(int[] arr) {
        int inner, outer;
        int temp;
        int step = 1;
        // ищем начальное значение step
        while (step <= arr.length / 3) {
            k++;
            step = step * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }

        while (step > 0) {
            k++;
            //сдвигаемся на 1 шаг, для step-сортировки следующей группы элементов
            for (outer = step; outer < arr.length; outer++) {

                temp = arr[outer];
                k++;
                inner = outer;
                k++;
                //сортируем массив с шагом step
                while (inner > step - 1 && arr[inner - step] >= temp) {
                    k++;
                    arr[inner] = arr[inner - step];
                    k++;
                    inner -= step;
                    k++;
                }
                arr[inner] = temp;
            }
            //на каждом шаге уменьшаем step
            step = (step - 1) / 3;
        }
        System.out.println(k);
        return arr;
    }
}
