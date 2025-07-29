import java.util.Scanner;

public class P43NumbersOnTheCircle {

    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int n = sc.nextInt();
        n++;
        long ans = 1;

        while(--n > 1) {
            ans *= n;
        }

        System.out.println(ans);
    }
}