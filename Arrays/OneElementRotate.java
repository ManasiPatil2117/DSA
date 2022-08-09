package Arrays;

public class OneElementRotate {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4};
        int t= a[0];        
             a[0] = a[a.length-1];
             a[a.length-1] = t;
             for(int i =0;i<a.length;i++)
             System.out.print(" "+a[i]);
    }
}
