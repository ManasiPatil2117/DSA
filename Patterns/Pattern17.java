import java.util.Scanner;
// 1
// 21
// 321
// 4321
// 54321
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i=1,j,c;
        while(i<=n){
            j=1;
            c=i;
            while(j<=i){
                System.out.print(c);
                c--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
