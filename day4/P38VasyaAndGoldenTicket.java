
import java.util.*;
public class P38VasyaAndGoldenTicket {
    static Scanner sc = new Scanner(System.in);

    public static boolean canBeDivided(String s) {
        int n = s.length();
        int totalSum = 0;
        int max = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            totalSum += s.charAt(i) - '0';
            max = Math.max(max, s.charAt(i) - '0');
            a[i] = s.charAt(i) - '0';
        }
        if (totalSum == 0) return true;
        for (int target = 2; target <= n; target++) {
            if (totalSum % target != 0) continue;

            long per_segement_value = totalSum / target;
            long curr_segment_value = 0;
            boolean check = true;
            for (int i = 0; i < n; i++) {
                
                curr_segment_value += a[i];
                if (curr_segment_value > per_segement_value) {
                    check = false;
                    break;
                } else if (curr_segment_value == per_segement_value) {
                    curr_segment_value = 0;
                }
            }
            if (check) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.next();

        if (canBeDivided(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}