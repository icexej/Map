import java.util.HashMap;

public class task07 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);

        scores.putIfAbsent("Aida", 90); // Не сработает
        scores.putIfAbsent("Mira", 88); // Добавит Mira
        System.out.println("Result: " + scores);
    }
}