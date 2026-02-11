import java.util.HashMap;

public class task18 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1); map1.put("B", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 2); map2.put("A", 1);

        System.out.println("Equal? " + map1.equals(map2));
        System.out.println("Hashcode 1: " + map1.hashCode());
        System.out.println("Hashcode 2: " + map2.hashCode());
    }
}