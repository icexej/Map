import java.util.*;

public class task14 {
    public static void main(String[] args) {
        String[] words = {"hi", "book", "java", "sun", "loop", "map"};
        HashMap<Integer, ArrayList<String>> groups = new HashMap<>();

        for (String w : words) {
            groups.computeIfAbsent(w.length(), k -> new ArrayList<>()).add(w);
        }
        System.out.println("Groups: " + groups);
    }
}