package day2;

import java.util.Scanner;

public class BuyingTv {
    static Scanner sr = new Scanner(System.in);

    // Function to calculate the greatest common divisor (GCD)
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long a = sr.nextLong();
        long b = sr.nextLong();
        long x = sr.nextLong();
        long y = sr.nextLong();

        long gcdXY = gcd(x, y);
        x /= gcdXY;
        y /= gcdXY;

        long maxK = Math.min(a / x, b / y);

        // The number of valid pairs (w, h) is equal to maxK
        System.out.println(maxK);
        long endTime = System.nanoTime();
    }
}