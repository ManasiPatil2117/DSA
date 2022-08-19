/**
 * PrintLikeaWave
 */
public class PrintLikeaWave {

    public static void main(String[] args) {
        int a[][] = new int[][] { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        for (int j = 0; j < 4; j++) {
            int i = 0;
            while (i < 3) {
                System.out.print(a[i][j] + " ");
                i++;
            }
            j++;
            if (i == 3) {
                i--;
                while (i >= 0) {
                    System.out.print(a[i][j] + " ");
                    i--;
                }
            }
        }
    }
}