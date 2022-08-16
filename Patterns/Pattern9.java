import java.util.Scanner;

// ****
// ***
// **
// *
public class Pattern9{
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int i =1,j,counter=n;
        while(i<=n){
            j=1;
            while(j<=counter){
                System.out.print("*");
                j++;
            }
            counter--;
            System.out.println();
            i++;
        }
    }
}