import java.util.Scanner;

public class P37MakeProductEqualOne {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long[] arr = new long[(int) n];

        long countNegative = 0;
        long ans = 0;
        long countZero = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = (int) sc.nextLong();
            if (arr[i] < 0) {
                countNegative++;
            }
            ans += Math.abs(Math.abs(arr[i]) - 1);
            if(arr[i] == 0) {
                countZero++;
            }
        }

        if(countNegative % 2 != 0 ) {
            if(countZero == 0) {
                ans += 2;
            }
            System.out.println(ans);
        } else {
            System.out.println(ans);
        }
    }
}