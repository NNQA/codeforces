
import java.util.Arrays;
import java.util.Scanner;




public class P41FancyPrimeCounter {
    static Scanner sc = new Scanner(System.in);

    // public static boolean isPrime(int n) {
    //     return !new String(new char[n]).matches(".?|(..+?)\\1+");
    // } check isPrime with regex
    

    //check is prime with boolean array
    public static void checkAllNumberIsPrimes(boolean[] isPrimes, int n) {
        isPrimes[0] = isPrimes[1] = false;

        for(int i = 2; i < n; i++) {
            if(isPrimes[i] && (long) i * i <= n) {
                for(int j = i * i; j <= n; j += i) {
                    isPrimes[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        int n = 300005;
        boolean[] isPrimes = new boolean[n + 1];
        Arrays.fill(isPrimes, true);
        
        int[] ans = new int[n];
        Arrays.fill(ans, 0);
        checkAllNumberIsPrimes(isPrimes, n);
        for(int i = 1; i <= 300003; i++){
            ans[i] += ans[i-1];
            if(isPrimes[i]) {
                ans[i]++;
            }
        }
        int q = sc.nextInt();

        while(q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(ans[b] - ans[a - 1]);
        }
        
    } 
}