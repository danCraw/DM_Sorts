package com.company;

public class QuickSort {
    static int k = 0;
    public static int[] sort(int[] arr, int low, int high) {
        if (arr.length == 0) {
            System.out.println(k);
            return arr;
        }//завершить выполнение если длина массива равна 0

        if (low >= high) {
            System.out.println(k);
            return arr;
        }//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = arr[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            k++;
            while (arr[i] < opora) {
                k++;
                i++;
            }

            while (arr[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                k++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j) {
            k++;
            sort(arr, low, j);
        }

        if (high > i) {
            k++;
            sort(arr, i, high);
        }
        System.out.println(k);
        return arr;
    }

}
