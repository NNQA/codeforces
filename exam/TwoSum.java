
import java.util.Scanner;


public class TwoSum {
    static Scanner sc = new Scanner(System.in);
    static boolean is_check_equal(int[] a, int k) {
        for(int i=0; i< a.length; i++){
            for(int j=i+1; j < a.length; j++){
                if(a[i] + a[j] == k){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {    
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if(is_check_equal(a, k)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}