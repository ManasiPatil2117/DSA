public class CountZeros {
    static int c =0;
    public static int count(int n){
        if(n==0)
        return 0;
        count(n/10);
        if(n%10==0){
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(count(10204));
    }
}
