public class MergingTwoSortedArrays {
    public static void main(String[] args) {
        int a1[] = new int[] { 2, 6, 8, 9 };
        int a2[] = new int[] { 3, 4, 5, 7 };
        int a3[] = new int[a1.length + a2.length];
        int i = 0, j = 0, x = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                a3[x++] = a1[i++];
            } else
                a3[x++] = a2[j++];
        }
        while (i < a1.length)
            a3[x++] = a1[i++];
        while (j < a2.length)
            a3[x++] = a2[i++];
        for (i = 0; i < a3.length; i++)
            System.out.println(a3[i]);
    }
}