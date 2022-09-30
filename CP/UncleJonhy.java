package CP;
import java.util.Arrays;
import java.util.Scanner;

class UncleJonhy {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int l = sc.nextInt();
            int a[] = new int[l];
            for (int i = 0; i < l; i++) {
                a[i] = sc.nextInt();
            }
            int n = sc.nextInt();
            int num = a[n-1];
            Arrays.sort(a);            
            int i =0;
            while(i<a.length){
                if(a[i]==num){
                    System.out.println(i+1);
                }
                i++;
            }
        }
    }
}
