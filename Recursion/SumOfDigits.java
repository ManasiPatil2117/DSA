
public class SumOfDigits {

    public static int cum(int n) {
        if (n == 0) {
            return 0;
        }
        return cum(n / 10) + (n%10);
    }
    public static void main(String[] args) {
        System.out.println(cum(12));
    }
}