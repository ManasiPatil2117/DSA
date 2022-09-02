public class CheckNumber {
    public static boolean check(int a[], int len, int e) {
        if (len == 1 && a[len - 1] != e || len == 0)
            return false;
        if (a[len - 1] == e)
            return true;
        return check(a, len - 1, e);

    }

    public static void main(String[] args) {
        int a[] = new int[] { 5 };

        System.out.println(check(a, a.length, 5));
    }
}
