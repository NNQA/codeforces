package  day1;

import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        int nInter = 0;

        Scanner sc = new Scanner(System.in);

        nInter = sc.nextInt();

        int[] arr = new int[nInter];

        for(int i = 0; i < nInter; i++) {
            arr[i] = sc.nextInt();
        }
        int aPos = 0; 
        int bPos = 0;

        aPos = sc.nextInt();
        bPos = sc.nextInt();

        int totalCandies = 0;

        for(int i = aPos; i <= bPos;  i++) {
            totalCandies += arr[i];
        }
        System.out.println(totalCandies);
    }
}