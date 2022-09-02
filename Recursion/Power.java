// package Recursion;

public class Power {
    public static int power(int n, int p) {
        if (p == 0)
            return 1;
        int small = power(n, p - 1);
        return small * n;
    }

    public static void main(String[] args) {
        System.out.print(power(2, 5));
    }
}
