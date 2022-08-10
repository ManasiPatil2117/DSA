package Arrays;

public class Sort_0_1_2 {
    public static void main(String[] args) {
        int a[] = new int[] { 0 ,1 ,2, 0, 1, 2, 0};
        int c = 0, o = 0, t = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[c++] = 0;
            } else if (a[i] == 1)
                o++;
            else if (a[i] == 2)
                t++;
        }
        while (o != 0) {
            a[c++] = 1;
            o--;
        }
        while (t != 0) {
            a[c++] = 2;
            t--;
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(" " + a[i]);
    }
}
