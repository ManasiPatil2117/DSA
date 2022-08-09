package Arrays;

public class SecondLargestUsingSort {
    public static void main(String[] args) {
        int a[] = new int[]{4,2,1,8,5};
        for(int i =0;i<a.length;i++){
            for(int j = i+1; j<a.length;j++ ){
                if(a[i]>a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }

        }
        System.out.print(" "+a[a.length-2]);
    }
}
