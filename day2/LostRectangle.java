package day2;

import java.util.Scanner;

public class LostRectangle {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n = sc.nextLong();
        long per = Long.MAX_VALUE; // Initialize per to the maximum possible value
        
        if (n == 1) {
            System.out.println(4);
            return;
        }

        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                long l = i;
                long w = n / i;
                long currentPerimeter = 2 * (l + w);
                if (currentPerimeter < per) {
                    per = currentPerimeter;
                }
            }
        }
        System.out.println(per);
    }
}