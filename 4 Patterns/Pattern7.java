
// 1
// 23
// 345
// 4567

import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1,j,counter;
        while(i<=n){
            j=1;
            counter=i;
            while(j<=i){
                System.out.print(counter);
                counter++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
