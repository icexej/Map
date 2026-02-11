import java.util.HashMap;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);
        scores.put("Azat", 92);
        scores.put("Dana", 77);
        System.out.println("Students: " + scores);
        System.out.println("Size: " + scores.size());
    }
}