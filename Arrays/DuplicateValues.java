package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateValues {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j] && i != j) {
                    if (!al.contains(a[i])){
                        al.add(a[i]);
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}
