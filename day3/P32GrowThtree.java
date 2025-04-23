
import java.util.Arrays;
import java.util.Scanner;

public class P32GrowThtree {


    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n = sc.nextLong();
        long[] k = new long[(int) n];
        for (int i = 0; i < n; i++) {
            k[i] = sc.nextLong();
        }
        Arrays.sort(k);
        boolean isVertical = true;
        long x = 0;
        long y = 0;
        int j = (int) (n - 1);
        int h = 0;
        for(int i = 0 ; i < n ; i++) {
            if(isVertical) {
                x += k[j];
                isVertical = false;
                j--;
            } else {
                y += k[h];
                isVertical = true;
                h++;
            }
        }
        long result = x*x + y*y;
        System.out.println(result);
    }
}


/// 1 1 1 2 2 3  
/// 3 2 2 1 1 1 
/// 1  2 3