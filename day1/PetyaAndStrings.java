package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// add bufferreader for faster input
public class PetyaAndStrings{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String a = br.readLine().toLowerCase();
        String b = br.readLine().toLowerCase();

        if(a.compareTo(b) == 0) {
            System.out.println("0");
        } else if (a.compareTo(b) > 0) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}