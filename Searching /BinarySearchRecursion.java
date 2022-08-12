// package Searching ;

public class BinarySearchRecursion {
    public static int search(int a[], int e, int start, int end) {
        int mid = (start + end) / 2;
        if (start > end)
            return -1;
        if (e == a[mid]) {
            return mid;
        } else if (e > a[mid]) {
            return search(a, e, mid + 1, end);
        } else {
            return search(a, e, start, mid - 1);
        }
    }
    public static void main(String[] args) {
        int a[] = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(search(a, 4, 0, a.length - 1));
    }
}
