package Arrays;

public class MinMaxSum {
    static int min, max;
    public static void main(String[] args) {
        int a[] = new int[] { -2, 1, -4, 5, 3, -2 };
        if (a.length == 1) {
            min = a[0];
            max = a[0];
        } else {
            min = a[0];
            max = a[1];
            for (int i = 0; i < a.length; i++) {
                if (min > a[i]) {
                    min = a[i];
                }
                if (max < a[i]) {
                    max = a[i];
                }

            }
        }
        System.out.println(min + " " +max);
        System.out.println(min+max);
    }
}
