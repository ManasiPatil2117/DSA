public class CheckSortedArray {
    public static boolean check(int a[]) {
        if (a.length <= 1) {
            return true;
        }
        if (a[0] > a[1])
            return false;

        int smallArray[] = new int[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            smallArray[i - 1] = a[i];
        }
        boolean smallAns = check(smallArray);
        return smallAns;
    }

    public static void main(String[] args) {
        int a[] = new int[] { 2, 4,3, 5, 6 };
        System.out.println(check(a));
    }
}
