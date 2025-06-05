
import java.util.Scanner;



public class P44MorseCode {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        
        int v1 = 1;
        int v2 = 1;
        int result = 1;

        for (int i = 1; i < n; i++) {
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }
        System.out.println(result);
    }
}