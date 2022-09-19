import java.util.Arrays;

public class SelectionSort {
    static void sort(int a[], int i, int j, int max) {
        if (i == 0)
            return;
        if (j < i) {
            if (a[j] > a[max]) {
                sort(a, i, j + 1, j);
            } else {
                int t = a[i - 1];
                a[i - 1] = a[max];
                a[max] = t;
                sort(a, i, j + 1, max);
            }
        }
        sort(a, i - 1, j = 0, max = 0);
    }

    public static void main(String[] args) {
        int a[] = { 4, 3, 2, 1 };
        sort(a, a.length, 0, 0);
        System.out.println(Arrays.toString(a));
    }
}
