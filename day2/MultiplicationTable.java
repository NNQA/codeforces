package day2;

import java.util.Scanner;

public class MultiplicationTable {
    static Scanner sr = new Scanner(System.in);

    public static long countOccurrences(int n, int x) {
        long count = 0;
        int limit = Math.min(n, (int)Math.sqrt(x));
        for (int i = 1; i <= limit; i++) {
            if (x % i == 0) {  
                int j = x / i; 
                if (j <= n) {
                    if (i != j) {
                        if (i <= n) count += 2;  
                    } else {
                        count++;  
                    }
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        int n = sr.nextInt();
        int x = sr.nextInt();
        
        long result = countOccurrences(n, x);
        System.out.println(result);
        
        sr.close();
    }   
}