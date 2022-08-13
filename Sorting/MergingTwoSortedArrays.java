public class MergingTwoSortedArrays {
    public static void main(String[] args) {
        int a1[] = new int[] { 1, 6, 8, 9, 15 };
        int a2[] = new int[] { 3, 4, 5, 6, 7, 16, 78 };
        int a3[] = new int[a1.length+a2.length];
        int i = 0, j = 0, k = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] > a2[j]) {
                a3[k] = a2[j];
                j++;
                k++;
            } else {
                a3[k] = a1[i];
                i++;
                k++;
            }
        }
        while (i < a1.length) {
            a3[k++] = a1[i];
            i++;
        }
        while (j < a2.length) {
            a3[k++] = a2[j];
            j++;
        }

        for (i = 0; i < a3.length; i++)
            System.out.println(a3[i]);
    }
}