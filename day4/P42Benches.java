
import java.util.Scanner;



public class P42Benches {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] benches = new int[n + 1];
        int max = Integer.MIN_VALUE;
        int sumCurrentPeople = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            benches[i] = x;
            sumCurrentPeople += x;
            max = Math.max(max, x);
        }

        int kMax =k + max;
        int kMinCandidatae = (sumCurrentPeople + k + n - 1) / n;
        int kMin = Math.max(kMinCandidatae, max);
        
        System.out.println(kMin + " " + kMax);
        
    }
}