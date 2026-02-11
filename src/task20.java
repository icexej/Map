import java.util.*;

public class task20 {
    public static void main(String[] args) {
        HashMap<String, Integer> s1 = new HashMap<>(Map.of("Aida", 40, "Azat", 35, "Dana", 50));
        HashMap<String, Integer> s2 = new HashMap<>(Map.of("Azat", 10, "Dana", 5, "Mira", 45));

        s2.forEach((name, val) -> s1.merge(name, val, Integer::sum));
        System.out.println("Merge Scores: " + s1);
    }
}