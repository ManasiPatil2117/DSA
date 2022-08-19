/**
 * PrintLikeaWave
 */
public class PrintLikeaWave {

    public static void main(String[] args) {
        int a[][] = new int[][] { { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 } };
        for (int j = 0; j < a[0].length; j++) {
            int i = 0;
            while (i < a.length) {
                System.out.print(a[i][j] + " ");
                i++;
            }
            if (i == a.length) {
                j++;
                i--;
                while (i >= 0 && j < a[0].length) {
                    System.out.print(a[i][j] + " ");
                    i--;
                }
            }
        }
    }
}