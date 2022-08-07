import java.util.Scanner;

// input is 5; output:
//     1
//    23
//   345
//  4567
// 56789
public class Pattern21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1, j, c = n;
        while (i <= n) {
            j = 0;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            c = i;
            while (j <= i) {
                System.out.print(c);
                c++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
