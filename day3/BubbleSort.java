package codeforces.day3;

import java.util.Scanner;

public class BubbleSort {
    static Scanner sr = new Scanner(System.in);

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
    static void Bubble_Sort(int n, int[] arr) {
        for(int i = 0 ; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            log(arr, n);
        }
    }
    public static void main(String args[]) {
        int n = sr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        Bubble_Sort(n, arr);
    } 
}