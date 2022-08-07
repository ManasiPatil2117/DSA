import java.util.Scanner;
// ***1
// **12
// *123
// 1234
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1,j;
        while(i<=n){
            j=1;
            while(j<=n-i){
                System.out.print("*");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }    
}
