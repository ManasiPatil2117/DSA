
import java.util.*;
 
//    1
//   121
//  12321
// 1234321

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1,j,c;
        while(i<=n){
            j=1;
            c=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print(c);
                c++;
                j++;
            }
            j=1;
            c=i-1;
            while(j<=i-1){
                System.out.print(c);
                j++;
                c--;
            }
            System.out.println();
            i++;
        }
    }
}
