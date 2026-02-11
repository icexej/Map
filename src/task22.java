import java.util.*;

public class task22 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(Map.of("java", 5, "is", 3, "fun", 10, "code", 2));

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Сортировка по убыванию

        System.out.println("Top 2 Frequent words:");
        for (int i = 0; i < 2 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " (" + list.get(i).getValue() + ")");
        }
    }
}