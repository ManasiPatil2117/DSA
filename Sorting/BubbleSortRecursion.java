public class BubbleSortRecursion {
    public static void sort(int a[], int n) {
        if (n == 1 || n == 0) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        sort(a, n - 1);
    }

    public static void main(String[] args) {
        int[] a = new int[] { 3, 1, 0, 1, 7, 2, 9 };
        sort(a, a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}
