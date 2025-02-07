package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class StringTask {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String in = br.readLine();
        String vowels = "AEIOUYaeiouy";
        String out = "";
        for (int i = 0; i < in.length(); i++) {
            if (vowels.indexOf(in.charAt(i)) == -1) {
                out += "." + Character.toLowerCase(in.charAt(i));
            }
        }
        System.out.println(out);
    }
}