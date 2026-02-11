import java.util.*;

public class task15 {
    public static void main(String[] args) {
        String s = "swiss";
        System.out.println(s);
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) counts.put(c, counts.getOrDefault(c, 0) + 1);

        String result = "None";
        for (char c : s.toCharArray()) {
            if (counts.get(c) == 1) {
                result = String.valueOf(c);
                break;
            }
        }
        System.out.println("First no-repeating: " + result);
    }
}