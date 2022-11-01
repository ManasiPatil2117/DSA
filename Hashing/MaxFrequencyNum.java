import java.util.*;

public class MaxFrequencyNum {
    public static void main(String[] args) {
        int arr[] = { 2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int v = map.get(arr[i]);
                map.put(arr[i], v + 1);
            }
        }
        int l = -1, k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (l < map.get(arr[i])) {
                l = map.get(arr[i]);
                k = arr[i];
            }
        }
        System.out.println(" Maximum Frequency Number is: " + k);

    }

}
