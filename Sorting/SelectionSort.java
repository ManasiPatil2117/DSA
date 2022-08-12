// package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[] { 4, 2, 7, 4, 9, 1 };
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min_idx] > a[j]) {
                    min_idx = j;
                }
            }
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < n; i++)
            System.out.print(" " + a[i]);

    }
}