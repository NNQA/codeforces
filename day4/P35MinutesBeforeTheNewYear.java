
import java.util.Scanner;


public class P35MinutesBeforeTheNewYear {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        while(n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int result = (24 - a - 1) * 60 + 60 - b;
            System.out.println(result);
        }
    }
}



