package Arrays;

import java.util.Scanner;

public class SwapAlternate {
    public static void swap(int a[]){
        // for(int i = 0;i<a.length;i++){
           int i=0,j=1;
            while(j<a.length)
           {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i+=2;
            j+=2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        swap(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
