package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int a[] = new int[]{  2 ,13, 4, 1, 3, 6, 28};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int i = 0 ;i < a.length ;i++){
            if(a[i]>first){
                second = first;
                first = a[i];
            }else if(a[i]>second && a[i]!=first){
                a[i] = second;
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("No Second Largest Value");
        }else{
            System.out.println(second);
        }

    }
}
