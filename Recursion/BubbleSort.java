import java.util.Arrays;

public class BubbleSort {
    static void sort(int[] a, int i, int j) {
        if (i == 0) {
            return;
        }
        if (j < i) {
            if (a[j] > a[j + 1]) {
                int t = a[j];
                a[j] = a[j + 1];
                a[j + 1] = t;

            }
            sort(a, i, j + 1);

        } else {
            sort(a, i - 1, j = 0);
        }
    }

    public static void main(String[] args) {
        int[] a = { 4, 3, 2, 1 };
        sort(a, a.length-1, 0);
        System.out.println(Arrays.toString(a));
    }
}
