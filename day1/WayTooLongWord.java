package  day1;

import java.util.Scanner;

public class WayTooLongWord {
    static Scanner sr = new Scanner(System.in);
    public static void main(String[] args) {
        int iInter = sr.nextInt();

        sr.nextLine();
        String in = null;

        for (int i = 0; i < iInter; i++) {
            in = sr.nextLine();
            if(in.length() > 10) {
            System.out.println("" + in.charAt(0) + (in.length() - 2) + in.charAt(in.length() - 1));
            } else {
                System.out.println(in);
            }
        }
    }
}