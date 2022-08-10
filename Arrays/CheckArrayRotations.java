package Arrays;

public class CheckArrayRotations {
    public static void main(String[] args) {
        int a[] = new int[] { 10, 20, 30, 1 };
        int i = 0, c = 1;
        if (a[0] > a[a.length - 1]) {
            while (a[i] <= a[i + 1]) {
                c++;
                i++;
            }
            System.out.println(c);
        } else {
            System.out.println(0);
        }
    }
}