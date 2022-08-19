public class LargestSumRowOrCol {
    public static void main(String[] args) {
        int a[][] = new int[][] { {1, 2},
            {90 ,100},
            {3, 40},
            {-10, 200} };
        int row = 0, col = 0, s, index=0;
        for (int i = 0; i < a.length; i++) {
            s = 0;
            for (int j = 0; j < a[i].length; j++) {
                s += a[i][j];
            }
            if (s > row) {
                index = i;
                row = s;
            }
        }
        for (int j = 0; j < a[0].length; j++) {
            s = 0;
            for (int i = 0; i < a.length; i++) {
                s += a[i][j];
            }
            {
                if (s > col)
                    col = s;
                index = j;
            }

        }
        if (row >= col) {
            System.out.println("row");
            System.out.println(index);
            System.out.println(row);
        }else{

            System.out.println("col");
            System.out.println(index);
            System.out.println(col);

        }
    }
}
