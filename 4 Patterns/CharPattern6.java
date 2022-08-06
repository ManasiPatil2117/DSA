// E
// DE
// CDE
// BCDE
// ABCDE
import java.util.*;

public class CharPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, j, endChar,temp;
        endChar = (char) ('A' + n - 1);
        while (i <= n) {
            j = 1;
            temp=(char) (endChar);
            while (j <= i) {
                System.out.print((char) (temp));
                j++;

                
                temp= (char) (temp+1);
            }
            endChar = (char) (endChar - 1);
            System.out.println();
            i++;
        }

    }
}
