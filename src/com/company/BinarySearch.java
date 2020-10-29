package com.company;

public class BinarySearch {
    int k = 0;
    public static int binarySearch(int arr[], int elementToSearch) {

        int k = 0;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            k++;
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
//                System.out.println("Количество сравнений " + k);
                return k;
            }
            else {
                if (arr[middleIndex] < elementToSearch) {
                    firstIndex = middleIndex + 1;
                }
                else if (arr[middleIndex] > elementToSearch) {
                    lastIndex = middleIndex - 1;
                }
            }
        }
        return k;
    }
}
