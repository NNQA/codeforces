import java.util.Arrays;
import java.util.Scanner;
 
public class SuperPrime {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2; i <= n; i++) {
            if(!isPrime[i]) continue;
            
            if(i > n/i) continue;
            
            for(int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        
        int superPrimeCount = 0;
        for(int i = 3; i <= n; i++) {
            if(isPrime[i] && isPrime[i - 2]) superPrimeCount++;
        }
        
        System.out.println(superPrimeCount);
    }
}
