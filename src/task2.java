import java.util.HashMap;

public class task2 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);

        System.out.println("Score Aida: " + scores.get("Aida"));

        if (scores.containsKey("Mira")) {
            System.out.println("Score Mira: " + scores.get("Mira"));
        } else {
            System.out.println("Student Mira is not finded");
        }
    }
}