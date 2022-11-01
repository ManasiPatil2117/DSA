import java.util.*;

public class UniqueChar {
    public static void main(String[] args) {
        String s = "ababcdd";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        System.out.println(map.keySet());

        Set<Character> set1 = new HashSet<>();
        char[] c = s.toCharArray();
        set1.addAll(Arrays.asList());
    }
}
