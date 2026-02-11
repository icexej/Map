import java.util.*;

public class task13 {
    public static void main(String[] args) {
        String s = "Mississippi";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char maxChar = ' ';
        int maxFreq = -1;
        for (var entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("count: " + map);
        System.out.println("Often: " + maxChar);
    }
}