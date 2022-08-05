// 1
// 23
// 456
// 78910
import java.util.*;
public class Pattern8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1,j,c=i;
        while(i<=n){
            j=1;
            while(j<=i){
                System.out.print(c);
                c++;
                j++;
            }
            System.out.println();
            i++;
        }
      
    }
}
