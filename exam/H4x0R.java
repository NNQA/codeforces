
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class H4x0R {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {    
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 4);
        map.put('i', 1);
        map.put('e', 3);
        map.put('o', 0);
        map.put('s', 5);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                result.append(map.get(c).toString());
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}