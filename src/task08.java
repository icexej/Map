import java.util.HashMap;

public class task08 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);

        scores.replace("Aida", 85, 86);
        scores.replace("Aida", 91);
        scores.replace("Missing", 100);
        System.out.println("After replace: " + scores);
    }
}