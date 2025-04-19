
import java.util.Scanner;



public class P30TemporarilyUnvalaiable  {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt();

        while(n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int r = sc.nextInt();

            int start = Math.min(a, b);
            int end = Math.max(a, b);

            int coverageStart = c - r;
            int coverageEnd = c + r;

            int overlapStart = Math.max(start, coverageStart);
            int overlapEnd = Math.min(end, coverageEnd);

            int overlap = Math.max(0, overlapEnd - overlapStart);
            int totalTime = end - start;

            System.out.println(totalTime - overlap);
        }
    }
}