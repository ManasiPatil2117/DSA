
// 1234
// 1234
// 1234
// 1234
import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1,j;
        while(i<=n){
            j=1;
            while(j<=n){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
