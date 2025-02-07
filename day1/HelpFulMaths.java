package day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelpFulMaths {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        try {
            String in = br.readLine();
            String[] inArr = in.split("\\+");
            int[] inArrInt = new int[inArr.length];
            for (int i = 0; i < inArr.length; i++) {
                inArrInt[i] = Integer.parseInt(inArr[i]);
            }
            for (int i = 0; i < inArrInt.length; i++) {
                for (int j = i + 1; j < inArrInt.length; j++) {
                    if (inArrInt[i] > inArrInt[j]) {
                        int temp = inArrInt[i];
                        inArrInt[i] = inArrInt[j];
                        inArrInt[j] = temp;
                    }
                }
            }
            for (int i = 0; i < inArrInt.length; i++) {
                System.out.print(inArrInt[i]);
                if (i != inArrInt.length - 1) {
                    System.out.print("+");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
}