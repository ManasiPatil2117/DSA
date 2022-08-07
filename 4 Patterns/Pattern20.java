import java.util.Scanner;

// input is 3; output:
//   *
//  *** 
// *****
public class Pattern20 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i = 1,j,c=n;
        while(i<=n){
            j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            j=1;
            c=i-1;
            while(j<=c){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
