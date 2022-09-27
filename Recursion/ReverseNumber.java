public class ReverseNumber {
    static int r = 0;

    static int print_1(int n) {
        if (n == 0) {
            return r;
        }
        r *= 10;
        r += n % 10;
        return print_1(n / 10);

    }

    static int print_2(int n, int d) {
        if (n == 0)
            return n;
        return (int) (n % 10 * Math.pow(10, d - 1) + print_2(n / 10, d - 1));
    }

    public static void main(String[] args) {
        System.out.println(print_2(1234, 4));
    }
}
