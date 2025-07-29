
import java.util.ArrayList;
import java.util.Scanner;



public class P46Eleven {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> checkArrayList(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 1;
        int fibo = 1;
        int prevfibo = 0;
        arr.add(1);
        while(i <= n) {            
            fibo = fibo + prevfibo;
            prevfibo = fibo - prevfibo;
            i++;
            if (fibo <= n) {
                arr.add(fibo);
            } else {
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        checkArrayList(arr, n);

        for(int i = 1; i <= n; i++) {
            if (arr.contains(i)) {
                System.out.print('O');
            } else {
                System.out.print('o');
            }
        }
    }
}