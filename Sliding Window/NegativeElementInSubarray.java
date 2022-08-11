// First Negative Number in every window of size k 
import java.util.ArrayList;

public class NegativeElementInSubarray {
    public static void main(String[] args) {
        int a[] = new int[] { -5, -1, -7, 8, -15, 30, -16, -28 };
        int i = 0, j = 0, n = a.length, k = 3;
        ArrayList<Integer> al = new ArrayList<>();
        while (j < n) {
            if (a[i] < 0) {
                if (!al.contains(a[i]))
                    al.add(a[i]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                i++;
                j++;
            }
        }
        System.out.println(al);
    }
}