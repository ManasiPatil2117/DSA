/**
 * RowWiseSum
 */
public class RowWiseSum {

    public static void main(String[] args) {
        int a[][] = new int[][] { { 1, 2, 3, 4 },
                { 9, 8, 7, 6 },
                { 3, 4, 5, 6 },
                { -1, 1, -10, 5 } };
        int s;
        for (int i = 0; i < 4; i++) {
            s = 0;
            for (int j = 0; j < 4; j++) {
                s = s + a[i][j];
            }
            System.out.print(s + " ");
        }
    }
}