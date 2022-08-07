import java.util.*;
// ****
//  ***
//   **
//    *
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1,j;
        while(i<=n){
            j=1;
            j=1;
            while(j<=i){
                System.out.print((" "));
                j++;
            }
            while(j<=n+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
