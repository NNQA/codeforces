import java.util.*;

public class ApplemanAndCardGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextInt();
        long k = sc.nextInt();
        String letter = sc.next();
        Map<Integer, Long> map = new HashMap<>();
        for(char i : letter.toCharArray()) {
            int a = (int) i - 'A';
            map.put(a, map.getOrDefault(a, 0L) + 1);
        }
        List<Long> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        
        long ans = 0;
        for(Long i : list) {
            if(k > 0) {
                if(i <= k) {
                    ans += i * i;
                    k -= i;
                } else {
                    ans += k * k;
                    k = 0;
                }
            } else break;
        }

        System.out.println(ans);
    }
}