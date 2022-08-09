package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();        
        int a[] = new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Array Rotations: ");
        int r = sc.nextInt();
        int c=0;
        int temp[] = new int[n];
        for(int i =r;i<n;i++){
            temp[c++]=a[i];
        }
        for(int i = 0 ;i <r ;i ++){
            temp[c++] = a[i];
        }

        
        for(int i =0;i<n;i++)
        System.out.print(" "+temp[i]);

    }   
}
