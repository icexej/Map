import java.util.*;

public class task19 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aizad", 90); map.put("Nina", 50);

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() < 60) it.remove();
        }
        System.out.println("After removing: " + map);
    }
}