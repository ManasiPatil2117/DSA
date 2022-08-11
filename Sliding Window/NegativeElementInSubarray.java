
// First Negative Number in every window of size k 
import java.util.ArrayList;

public class NegativeElementInSubarray {
    public static void main(String[] args) {
        int a[] = new int[] { -5, -1, -7, -5, 8, -15, 30, -16, -28 };
        int i = 0, j = 0, n = a.length, k = 3;
        ArrayList<Integer> al = new ArrayList<>();
        while (j < n) {
            if (a[i] < 0) {
                al.add(a[i]);
            }
            if (j - i + 1 < k) {
                al.remove(0);
                j++;
            } else if (j - i + 1 == k) {
                i++;
                j++;
            }
        }
        System.out.println(al);
    }
}