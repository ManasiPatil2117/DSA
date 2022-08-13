public class QuickSort {
    public static int partition(int a[], int start, int end) {
        int pivot = a[end];
        int i = start - 1;
        // sorting and storing smaller elements than pivot
        for (int j = start; j < end; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // positioning pivot element
        i++;
        int temp = a[i];
        a[i] = a[end];
        a[end] = temp;

        return i; // pivot index

    }

    public static void quicksort(int a[], int start, int end) {
        if (start >= end)
            return;

        int pivotindex = partition(a, start, end);
        quicksort(a, start, pivotindex - 1);
        quicksort(a, pivotindex + 1, end);

    }

    public static void main(String[] args) {
        int a[] = new int[] { 3, 6, 1, 9, 2, 0, 5 };
        quicksort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
