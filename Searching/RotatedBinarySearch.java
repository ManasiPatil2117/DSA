public class RotatedBinarySearch {
    static int search(int[] a, int t) {
        return search(a, 0, a.length - 1, t);
    }

    static int search(int a[], int s, int e, int t) {
        if (s > e)
            return -1;
        int mid = s + (e - s) / 2;
        if (a[mid] == t)
            return mid;
        if (a[s] > a[e]) {
            if (a[s] <= a[mid] && t >= a[s]) {
                return search(a, s, mid - 1, t);
            } else
                return search(a, mid + 1, e, t);

        } else {
            if (t > a[mid])
                return search(a, mid + 1, e, t);
            else
                return search(a, s, mid - 1, t);
        }
    }

    public static void main(String[] args) {
        int a[] = { 5, 6, 7, 8, 9, 0, 1, 2, 3 };
        System.out.println(search(a, 3));
    }
}
