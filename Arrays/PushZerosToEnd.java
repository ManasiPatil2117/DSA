package Arrays;

import java.util.Scanner;

public class PushZerosToEnd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            if(a[i]!=0){
                a[c++] = a[i];
            }
        }
        while(c<n){
            a[c++] = 0;
        }
        for(int i =0;i<n;i++)
        System.out.print(" "+a[i]);
    }
}