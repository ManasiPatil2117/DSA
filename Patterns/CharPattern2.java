// ABCD
// BCDE
// CDEF
// DEFG
import java.util.*;
public class CharPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1,j,startingChar;
        while(i<=n){
            j=1;
            startingChar ='A'+i-1;
            while(j<=n){
                System.out.print((char)(startingChar+j-1));
                j++;
            }
            System.out.println();
            i++;
        }
    }    
}
