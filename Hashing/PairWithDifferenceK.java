import java.util.HashMap;

public class PairWithDifferenceK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4 };
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Integer e : map.keySet()) {
            if (map.containsKey(e + k)) {
                System.out.println(e + " " + (e + k));

            }
        }
    }
}
