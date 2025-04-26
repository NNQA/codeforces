
import java.util.Arrays;
import java.util.Scanner;

public class SquareOfSticks {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {    
        int n = sc.nextInt();
        long[] a = new long[n];
        
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = i + 1; j < n; j++){
                if(a[j] >= a[i]){
                    count++;
                }
            }
            if(count == 3) {
                ans = Math.max(ans, a[i] * a[i]);
            }
        }
        System.out.println(ans);
    }
}