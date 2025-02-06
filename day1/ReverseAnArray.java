package day1;

import java.util.Scanner;

public class ReverseAnArray {

    static void reverseArray(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int nInter = 0;

        Scanner inputNumber = new Scanner(System.in);
        nInter = inputNumber.nextInt();

        int[] array = new int[nInter];
        for(int i = 0; i < nInter; i++) {
            array[i] = inputNumber.nextInt();
        }
        reverseArray(array);
    }
}