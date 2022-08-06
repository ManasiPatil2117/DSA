// E
// DD
// CCC
// BBBB
// AAAAA
import java.util.*;

public class CharPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, j, endChar;
        endChar = (char) ('A' + n - 1);
        while (i <= n) {
            j = 1;
            while (j <= i) {
                System.out.print((char) (endChar));
                j++;
            }
            endChar = (char) (endChar - 1);
            System.out.println();
            i++;
        }

    }
}
