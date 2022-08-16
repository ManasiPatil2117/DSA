// 4321
// 4321
// 4321
// 4321
import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, j;
         while(i<=n){
            j=1;
            while(j<=n){
                System.out.print(n-j+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
