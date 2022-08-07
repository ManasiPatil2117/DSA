package Arrays;

import java.util.Scanner;

public class ArrangingNumOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0, end = n - 1;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                a[start] = i;
                start++;
            } else {
                a[end] = i;
                end--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
    }
}