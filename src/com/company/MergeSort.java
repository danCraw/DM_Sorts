package com.company;

import java.util.Arrays;

public class MergeSort {
    static int k = 0;
    public static int[] sort(int[] arr) {
        int[] buffer1 = Arrays.copyOf(arr, arr.length);
        int[] buffer2 = new int[arr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, arr.length);
        System.out.println(k);
        return result;
    }


//      param buffer1    Массив для сортировки.
//      param buffer2    Буфер. Размер должен быть равен размеру buffer1.
//      param startIndex Начальный индекс в buffer1 для сортировки.
//      param endIndex   Конечный индекс в buffer1 для сортировки.


    public static int[] mergeSortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {

        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        // Слияние

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            k++;
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
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
