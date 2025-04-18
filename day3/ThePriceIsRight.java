package codeforces.day3;

import java.util.Scanner;

public class ThePriceIsRight {

    static Scanner sr = new Scanner(System.in);
    public static int findMinLoop(int[] arr) {
        int flagMin = arr[0];
        int indexMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < flagMin) {
                flagMin = arr[i];
                indexMin = i;
            }
        }
        return indexMin;
    }


    public static int findMinDivide(int[] arr, int left, int right) {
        if (left == right) return left;

        int mid = (left + right) / 2;
        int minLeft = findMinDivide(arr, left, mid);
        int minRight = findMinDivide(arr, mid + 1, right);

        return arr[minLeft] < arr[minRight] ? minLeft : minRight;
    }

    public static void main(String args[]) {
        int n = sr.nextInt();

        int[] arrPrice = new int[n];

        for (int i = 0; i < n; i++) {
            arrPrice[i] = sr.nextInt();
        }

        long start1 = System.nanoTime();
        int index1 = findMinLoop(arrPrice);
        long end1 = System.nanoTime();
        System.out.println("Loop Min Index: " + index1 + ", Value: " + arrPrice[index1]);
        System.out.println("⏱ Loop Time: " + (end1 - start1) / 1_000_000.0 + " ms");

        long start2 = System.nanoTime();
        int index2 = findMinDivide(arrPrice, 0, arrPrice.length - 1);
        long end2 = System.nanoTime();
        System.out.println("Divide Min Index: " + index2 + ", Value: " + arrPrice[index2]);
        System.out.println("⏱ Divide Time: " + (end2 - start2) / 1_000_000.0 + " ms");
    }
}