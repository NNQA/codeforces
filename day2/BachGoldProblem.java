package day2;

import java.util.Scanner;

public class BachGoldProblem {
    static Scanner sr = new Scanner(System.in);

    
    static void solve(int n) {
        if (n == 2) {
            System.out.println(1);
            System.out.println("2");
            return;
        }
        if (n == 3) {
            System.out.println(1);
            System.out.println("3");
            return;
        }
        int k;
        StringBuilder primes = new StringBuilder();
        
        if (n % 2 == 0) {
            k = n / 2;
            for (int i = 0; i < k; i++) {
                primes.append("2 ");
            }
        } else {
            k = (n - 3) / 2 + 1; 
            for (int i = 0; i < k - 1; i++) {
                primes.append("2 ");
            }
            primes.append("3");
        }

        System.out.println(k);
        System.out.println(primes.toString().trim());
    }
    public static void main(String[] args) {
        int n = sr.nextInt();
        solve(n);
        sr.close();
    }
}
