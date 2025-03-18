package day1;

import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        String arr = sc.nextLine();
        int eights = 0;
        for (int i = 0; i < n; i++) {
           if(arr.charAt(i) == '8') {
                eights++;
           }
        }
        if(eights >= n/11) {
            System.out.println(n/11);
        } else if(eights < n/11 && n > 11) {
            System.out.println(eights);
        } else {
            System.out.println(0);
        }
    }
}