import java.util.Scanner;

//  4444
// 	333
// 	22
// 	1
public class Pattern19 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i = 1,j,c=n;
        while(i<=n){
            j=1;
            while(j<=c){
                System.out.print(c);
                j++;
            }
            c--;
            System.out.println();
            i++;
        }

    }
}
