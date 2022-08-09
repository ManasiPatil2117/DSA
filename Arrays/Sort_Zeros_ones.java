public class Sort_Zeros_ones {
    public static void main(String[] args) {
        int a[] = new int[] { 0, 1, 1, 0, 1, 0, 1 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(" " + a[i]);
    }
}