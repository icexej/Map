import java.util.HashMap;

public class task5 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);

        System.out.println("Empty? " + scores.isEmpty());
        scores.clear();
        System.out.println("Empty after clear()? " + scores.isEmpty());
    }
}