// A
// BB
// ccc
// DDD
import java.util.*;
public class CharPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1,j;
        while(i<=n){
            j=1;
            while (j<=i) {
                System.out.print((char)('A'+i-1));
                j++;
            }
            System.out.println();
            i++;
        }
       
    }    
}
