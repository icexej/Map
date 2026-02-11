import java.util.*;

public class task21 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentToScore = new HashMap<>(Map.of("Aida", 90, "Mira", 90, "Azat", 85));
        HashMap<Integer, ArrayList<String>> scoreToStudents = new HashMap<>();

        studentToScore.forEach((name, score) ->
                scoreToStudents.computeIfAbsent(score, k -> new ArrayList<>()).add(name)
        );
        System.out.println("Inventing a map: " + scoreToStudents);
    }
}