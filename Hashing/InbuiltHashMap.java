import java.util.*;

public class InbuiltHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("abc", 1);
        map.put("abc1", 2);
        map.put("def", 3);

        System.out.println(map.get("abc1"));

        Set<String> keys = map.keySet();
        for (String s : keys)
            System.out.println(s);

        if (map.containsKey("def")) // O(1)
            System.out.println("as def");

        if (map.containsValue(2)) // O(N)
            System.out.println("has 2");

        System.out.println(map.size());

    }
}