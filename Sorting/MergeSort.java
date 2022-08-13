public class MergeSort {
    public static void conqure(int a[], int start, int mid, int end) {
        int merged[] = new int[end - start + 1];
        int index1 = start;
        int index2 = mid + 1;
        int x = 0;
        while (index1 <= mid && index2 <= end) {
            if (a[index1] <= a[index2]) {
                merged[x++] = a[index1++];
            } else {
                merged[x++] = a[index2++];
            }
        }
        while (index1 <= mid) {
            merged[x++] = a[index1++];
        }
        while (index2 <= end) {
            merged[x++] = a[index2++];
        }
        for (int i = 0, j = start; i < merged.length; i++, j++)
            a[j] = merged[i];
    }

    public static void divide(int a[], int start, int end) {
        if (start >= end)
        return;
        int mid = start + (end - start) / 2;
        divide(a, start, mid);
        divide(a, mid + 1, end);
        conqure(a, start, mid, end);
    }

    public static void main(String[] args) {
        int a[] = new int[] { 4, 2, 9, 1, 0, 7 };
        divide(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
