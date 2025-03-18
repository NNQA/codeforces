package day1;

import java.util.Scanner;

public class Cashier {
    static Scanner sr = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sr.nextInt();
        int L = sr.nextInt();
        int a = sr.nextInt();

        int ans = 0, c, d, pre = 0;

        while(n != 0) {
            c = sr.nextInt();
            d = sr.nextInt();

            ans += (c - pre) / a;
            pre = c + d;
            n--;
        }
        System.out.println(ans + (L - pre) / a);
        
    }
}