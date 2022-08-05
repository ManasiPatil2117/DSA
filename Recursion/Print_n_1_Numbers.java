public class Print_n_1_Numbers{
    static void Print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        Print(n-1);
    }
    public static void main(String[] args) {
        Print(4);
    }
}