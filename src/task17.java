import java.util.*;

public class task17 {
    public static void main(String[] args) {
        String[] items = {"apple", "banana", "apple", "orange", "banana", "kiwi"};
        HashMap<String, Integer> counts = new HashMap<>();
        for (String item : items) counts.put(item, counts.getOrDefault(item, 0) + 1);

        System.out.print("Unical: ");
        counts.forEach((k, v) -> { if(v == 1) System.out.print(k + " "); });

        System.out.print("\nDuplicates: ");
        counts.forEach((k, v) -> { if(v > 1) System.out.print(k + "(" + v + ") "); });
    }
}