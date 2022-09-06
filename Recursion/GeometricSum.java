public class GeometricSum {
    public static double cal(int k){
        if(k==0)
        return 1;
        double a = cal(k-1);
        return a+(1/(Math.pow(2, k)));
    }
    public static void main(String[] args) {
        System.out.println(cal(8));
    }
}
