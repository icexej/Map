import java.util.HashMap;
import java.util.Map;

public class task11 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 91);
        scores.put("Mira", 88);
        scores.put("Dana", 95);

        int max = -1;
        String name = "";
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println("The best student: " + name + " with the score " + max);
    }
}