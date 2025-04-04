package day2;

import java.util.Scanner;

public class DivisorCount {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            ans += n / i;
        }
        System.out.println(ans);
    }
}