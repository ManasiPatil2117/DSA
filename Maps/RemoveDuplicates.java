import java.util.*;

public class RemoveDuplicates {
    static ArrayList<Integer> remove(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                al.add(arr[i]);
                map.put(arr[i], true);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 1, 2, 3, 4, 2, 1, 3, 1, 3, 7, 999 };
        ArrayList<Integer> al = remove(arr);
        System.out.println(al);
    }
}
