public class SumOfArrayEle {
   public static int sum(int[] a){
        if(a.length <=0)
        return 0;
        int smallArray[] = new int[a.length-1];
        for(int i = 1; i < a.length;i++){
            smallArray[i-1] = a[i];
        }
        return sum(smallArray) + a[0];
    }
    public static void main(String[] args) {
        int a[] = new int[]{  4 ,2 ,1};
        System.out.println(sum(a));
    }
}
