import java.util.*;

// using bitwise operations to solve the problem
// The problem is to find the minimum cost to get all vitamins A, B, and C
// Use a 3-bit binary to represent which vitamins are covered:

// Vitamins	Bitmask
// A	1 (001)
// B	2 (010)
// C	4 (100)
// "A" => 1

// "B" => 2

// "C" => 4

// "AB" => 1+2 = 3

// "AC" => 1+4 = 5

// "BC" => 2+4 = 6

// "ABC" => 1+2+4 = 7


public class P39Vitamins {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] minCost = new int[8];
        Arrays.fill(minCost, Integer.MAX_VALUE);
        while(n-- > 0) {
            int cost = sc.nextInt();
            String s = sc.next();
            int mask = 0;
            if (s.contains("A")) mask |= 1;  
            if (s.contains("B")) mask |= 2;  
            if (s.contains("C")) mask |= 4;  
            minCost[mask] = Math.min(minCost[mask], cost);
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                for (int k = 1; k < 8; k++) {
                    if ((i | j | k) == 7 &&
                        minCost[i] != Integer.MAX_VALUE &&
                        minCost[j] != Integer.MAX_VALUE &&
                        minCost[k] != Integer.MAX_VALUE) {
                        int totalCost = minCost[i] + minCost[j] + minCost[k];
                        answer = Math.min(answer, totalCost);
                    }
                }
            }
        }
        for (int i = 1; i < 8; i++) {
            if (minCost[i] == Integer.MAX_VALUE) continue;

            if (i == 7) {
                answer = Math.min(answer, minCost[i]);
            }

            for (int j = 1; j < 8; j++) {
                if (minCost[j] == Integer.MAX_VALUE) continue;
                if ((i | j) == 7) {
                    answer = Math.min(answer, minCost[i] + minCost[j]);
                }
            }
        }

        System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
    }
}