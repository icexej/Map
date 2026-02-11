import java.util.HashMap;

public class task3 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Dana", 77);

        Integer oldScore = scores.put("Dana", 80);
        System.out.println("Before: " + oldScore);
        System.out.println("After: " + scores);
    }
}