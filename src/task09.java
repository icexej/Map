import java.util.HashMap;
import java.util.Map;

public class task09 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 91);
        scores.put("Mira", 88);

        System.out.println("keySet: " + scores.keySet());
        System.out.println("values: " + scores.values());

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }
}