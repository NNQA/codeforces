package day2;

import java.util.Scanner;

public class AlmostPrime {
    static Scanner sc = new Scanner(System.in);

    static int[] countPrimeDivisors(int n) {
        int[] primeDivisors = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (primeDivisors[i] == 0) { 
                for (int j = i; j <= n; j += i) {
                    primeDivisors[j]++;
                }
            }
        }
        return primeDivisors;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] primeDivisors = countPrimeDivisors(n);

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (primeDivisors[i] == 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}