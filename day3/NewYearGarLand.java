package day3;

import java.util.Scanner;

public class NewYearGarLand {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();

        while(n != 0) {
            int r;
            int g;
            int b;
            r = sc.nextInt();
            g = sc.nextInt();
            b = sc.nextInt();
            boolean rp = false;
            boolean gp = false;
            boolean bp = false;

            if (g + b >= r - 1) rp = true;
		    if (r + b >= g - 1) gp = true;
		    if (r + g >= b - 1) bp = true;
            if (rp && gp && bp) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            n--;
        }
    }
}