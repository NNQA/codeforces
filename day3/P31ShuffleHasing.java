
import java.util.Scanner;



public class P31ShuffleHasing {

    public static String sortCharsStream(String inputSrting) {
        if(inputSrting == null || inputSrting.isEmpty()) {
            return inputSrting;
        }
        return inputSrting.chars()
                .mapToObj(c -> (char) c)
                .sorted()
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();

        while(n-- > 0) {
            String p = sc.next();
            String h = sc.next();
            if (h.length() < p.length()) {
                System.out.println("NO");
                continue;
            }
            if(p.length() == h.length()) {
                String sortedP = sortCharsStream(p);
                String sortedH = sortCharsStream(h);
                if(sortedP.equals(sortedH)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }
            String sortedP = sortCharsStream(p);
            for(int i = 0; i <= h.length() - p.length(); i++) {
                String substringH = h.substring(i,i + p.length());
                String sortedH = sortCharsStream(substringH);
                if (sortedP.equals(sortedH)) {
                    System.out.println("YES");
                    break;
                }
                if(i == h.length() - p.length()) {
                    System.out.println("NO");
                    break;
                }
            } 
        }
    }
}