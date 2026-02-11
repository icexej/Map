import java.util.*;

public class task12 {
    public static void main(String[] args) {
        String input = "My name is Aisulu . What is your name ?";
        String[] words = input.toLowerCase().split(" ");
        HashMap<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        System.out.println("Count: " + counts);
    }
}