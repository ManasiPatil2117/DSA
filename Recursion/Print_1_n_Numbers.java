//Print 1 to 5 numbers using recursion
public class Print_1_n_Numbers{
    static void Print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        Print(n-1);
           System.out.println(n);
    }
    public static void main(String args[]){
        Print(5);
    }
}