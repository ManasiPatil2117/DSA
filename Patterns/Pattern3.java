// 1111
// 2222
// 3333
// 4444
import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1,j;
        while(i<=n){
            j=1;
            while(j<=n){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
