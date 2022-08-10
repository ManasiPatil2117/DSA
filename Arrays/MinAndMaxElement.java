package Arrays;

public class MinAndMaxElement {
    public static void main(String[] args) {
        int a[] = new int[]{1,4,2,6,3,9};
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min= a[i];
            }
        }
        System.out.print(max+" "+min);
    }
}
