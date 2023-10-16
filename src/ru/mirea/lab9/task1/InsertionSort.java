package ru.mirea.lab9.task1;

public class InsertionSort {
    public static void insertionSort(Comparable[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++){
            Comparable current = arr[i];
            int j = i - 1;

            while (j >= 0 && current.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }
}