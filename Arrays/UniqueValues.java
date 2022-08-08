package Arrays;

import java.util.Scanner;

public class UniqueValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    flag++;
                }
            }
            if (flag == 1) {
                System.out.println(a[i]);
            }
        }
    }
}
