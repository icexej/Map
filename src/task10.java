import java.util.HashMap;

public class task10 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 91);
        scores.put("Dana", 77);
        scores.put("Mira", 88);

        int count = 0;
        for (Integer s : scores.values()) {
            if (s >= 80) count++;
        }
        System.out.println("(>=80): " + count);
    }
}