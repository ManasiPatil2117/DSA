import java.util.Scanner;
public class LinearSearch {
    public static int search(int a[], int n) {
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.println(search(a, n));

    }
}
