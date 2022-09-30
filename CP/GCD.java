package CP;
public class GCD {
    public static void main(String[] args) {
        int a = 14, b = 8;
        int mini = a < b ? a : b;
        int gcd = 1;
        for (int i = mini; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        for (int i = Math.max(a, b);; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("LCM= " + i);
                break;

            }
        }
        System.out.println(a * b / gcd);
        System.out.println(gcd);
    }
}
