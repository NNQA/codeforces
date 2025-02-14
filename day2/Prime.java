package day2;

import java.util.Scanner;

public class Prime {
    static Scanner sc = new Scanner(System.in);

    static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        boolean[] isPrime = sieveOfEratosthenes(n);

        int count = 0;
        StringBuilder primes = new StringBuilder();

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
                primes.append(i).append(" ");
            }
        }

        System.out.println(count);
        System.out.println(primes.toString().trim());
    }
}