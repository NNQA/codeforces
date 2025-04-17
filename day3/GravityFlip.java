package codeforces.day3;

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    static Scanner sr  = new Scanner(System.in);

    // using arrays.sort() method to sort the array in ascending order

    static void ArraysSort(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void countingSort(int[] arr) {
        int n = arr.length;
        int m = 0;

        for(int i = 0; i < n; i++) {
            m = Math.max(m, arr[i]);
        }

        int[] count = new int[m + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;   
        }

        for (int i = 1; i < m + 1; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n = sr.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
        }
        countingSort(arr);
    }
}