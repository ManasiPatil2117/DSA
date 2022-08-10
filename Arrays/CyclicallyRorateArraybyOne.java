package Arrays;

public class CyclicallyRorateArraybyOne {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        int n = a.length,temp = a[n-1];
        for(int i =0;i<n-1;i++){
            a[n-i-1] = a[n-i-2];
        }
        a[0] =temp;
        for(int i =0;i<n;i++)
        System.out.print(" "+a[i]);
    }
}
