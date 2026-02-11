import java.util.HashMap;

public class task06 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);

        int score = scores.getOrDefault("Mira", -1);
        if (score == -1) System.out.println("Not found");
        else System.out.println("Score: " + score);
    }
}