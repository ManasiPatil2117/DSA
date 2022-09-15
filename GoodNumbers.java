public class GoodNumbers {

    public static boolean isvalid(int n, int d) {
        int last = n % 10;
        int sum = last;
        if (last == d)
            return false;
        n = n / 10;
        while (n > 0) {
            last = n % 10;
            if (last == d || sum >= last) {
                return false;
            } else {
                sum += last;
                n /= 10;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int L = 410, R = 520, D = 3;
        for (int i = L; i <= R; i++) {
            if (isvalid(i, D)) {
                System.out.println(i);
            }
        }
    }
}
