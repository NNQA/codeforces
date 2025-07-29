import java.util.Scanner;
public class P45CollatzConjectture {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        long n = sc.nextLong();
        System.out.println(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
        }
    }
}