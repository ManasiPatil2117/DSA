//     1 
//   12
// 123
import java.util.*;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1,j,m=n;
        while(i<=n){
            j=1;
            while(j<=m){
                System.out.print(" ");
                m=m+2;
                j++;
            }
            
            j=1;
            while(j<=i){
            // System.out.print("*");
            System.out.print(j);
            j++;

            }
            System.out.println();
            i++;
        }
    }
        
}
