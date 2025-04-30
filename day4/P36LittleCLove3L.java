
import java.util.Scanner;



public class P36LittleCLove3L {
    static Scanner sc = new Scanner(System.in);

    static int isMultipleOf3(int n) {
        return n % 3;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        if(n % 3 == 0) {
            System.out.println(1 + " " + 1 + " " + (n - 2));
        } else {
            System.out.println(1 + " " + 2 + " " + (n - 3));
        }
    }
}