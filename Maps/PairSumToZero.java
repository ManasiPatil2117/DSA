import java.util.*;

public class PairSumToZero {
    public static void main(String[] args) {
        int arr[] = { 2, 1, -2, 2, 3 };
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                Integer v = map.get(arr[i] + 1);
                map.put(arr[i], v);
            }
        }
        for (int e : map.keySet()) {
            if (map.containsKey(sum - e)) {
                if ((sum - e) < 0) {
                    System.out.print((sum - e) + " ");
                    System.out.print((e));
                } else {
                    System.out.print((e) + " ");
                    System.out.print((sum - e));

                }
                System.out.println();
            }
        }

    }

}
