import java.util.HashMap;

public class ArrayIntersection {
    public static void main(String[] args) {
        int arr2[] = { 2, 6, 1, 2, 2 };
        int arr1[] = { 1, 2, 3, 4, 2 };
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], 1);
            } else {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!map2.containsKey(arr2[i])) {
                map2.put(arr2[i], 1);
            } else {
                map2.put(arr2[i], map2.get(arr2[i]) + 1);
            }
        }

        for (Integer e : map.keySet()) {
            Integer t = map2.get(e);
            if (t != null) {
                while (t-- >= 1) {
                    System.out.println(e);
                }
            }
        }

    }

}
