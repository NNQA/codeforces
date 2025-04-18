package day3;

import java.util.Scanner;

public class SelectionSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void log(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void selectionSort(int[] arr, int n) {
        int minIndex = 0;
        for(int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
            log(arr, n);
        }
    }
    static Scanner sr = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sr.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        selectionSort(arr, n);
    }
}