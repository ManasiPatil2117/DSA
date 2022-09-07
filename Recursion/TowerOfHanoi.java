public class TowerOfHanoi {
    public static void place(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println(from + " " + to);
            return;
        }
        place(n - 1, from, aux, to);
        System.out.println(from + " " + to);
        place(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        place(2, 'A', 'C', 'B');
    }
}
