
import java.util.Arrays;
import java.util.Scanner;


public class AmusingJoke {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = "";
        d += a + b;
        char[] dArray = d.toCharArray();
        char[] cArray = c.toCharArray();
        Arrays.sort(dArray);
        Arrays.sort(cArray);

        String sortedD = new String(dArray);
        String sortedC = new String(cArray);

        if (sortedD.equals(sortedC)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}