import java.util.HashMap;

public class task04 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Azat", 92);

        System.out.println("Remove Azat: " + scores.remove("Azat"));
        System.out.println("Remove NonExisting: " + scores.remove("NonExisting"));
        System.out.println("After removing: " + scores);
    }
}