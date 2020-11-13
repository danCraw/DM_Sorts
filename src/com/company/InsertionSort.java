package com.company;

public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int k = 0;
        for (int left = 1; left < arr.length; left++) {
// Вытаскиваем значение элемента
            int value = arr[left];
// Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                k++;
// Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
// Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
// В освободившееся место вставляем вытащенное значение
            arr[i + 1] = value;
        }
        System.err.println(k);
        return arr;
    }
}
