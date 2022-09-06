public class Multiplication {
    public static int mul(int m, int k){
        if(k==0)
        return 0;
        int n =  mul(m,k-1);
        return n+m;
    }
    public static void main(String[] args) {
        System.out.println(mul(3,3));
    }
}
