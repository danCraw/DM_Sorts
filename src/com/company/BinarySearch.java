package com.company;

public class BinarySearch {
    int k = 0;
    public static int bs(int arr[], int elementToSearch) {

        int k = 0;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            k++;
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
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
