import java.util.*;

public class ScoresInOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        List<Integer> sortedScores = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            
            int position = 0;
            while (position < sortedScores.size() && sortedScores.get(position) >= score) {
                position++;
            }
            sortedScores.add(position, score);
            
            System.out.println(position + 1);
        }
        
        Collections.sort(sortedScores, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sortedScores.size(); i++) {
            result.append(sortedScores.get(i));
            if (i < sortedScores.size() - 1) {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
        
        scanner.close();
    }
}
