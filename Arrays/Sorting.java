package Arrays;

public class Sorting {
    public static void main(String[] args) {
        int a[] = new int[]{1,-2,-3,5,-3};
        int temp[] = new int[a.length];
        int start = 0, end = a.length-1;
        for(int i = 0; i < a.length;i++){
            if(a[i]<0){
                temp[start] = a[i];
                start++;
            }else if(a[i]>=0){
                temp[end] = a[i];
                end--;
            }
        }
        for(int i = 0; i < a.length;i++)
        System.out.print(" "+temp[i]);
    }
}
