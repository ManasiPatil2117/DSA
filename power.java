public class power {
    public static long print(int x, int n){
        if(n==0)
        return 1;
        long small = print(x,n/2);
        if(n%2==0){
            return small*small;
        }
        return small*small*x;
    }
    public static void main(String[] args) {
        // approach 1-
        int x = 2, n =4;
        int p =1;
        // for(int i =0;i<n;i++){
        //     p*=x;
        // }
        
        // approach 2-
        // while(n!=0){
        //     p=x*x;
        //     n--;
        // }

        // approach 3-
        while (n!=0) {
            p*=x;
            if(n%2==0){
                // n=n/2;
                p*=x;
                n=n-1;
            }else{
                p=p*x;
                n=n/2;
                // n=n--;
                // p*=n;
            }
        }
       System.out.println(print(2,21));
        // System.out.println(p);
    }
}
