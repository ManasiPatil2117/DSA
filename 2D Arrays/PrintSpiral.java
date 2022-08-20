/**
 * PrintSpiral
 */
public class PrintSpiral {

    public static void main(String[] args) {

        int a[][] = new int[][] {{ 1 ,2, 3, 4}, 
            {5 ,6, 7, 8}, 
            {9, 10 ,11 ,12}, 
            {13, 14 ,15 ,16} };
        int n = a.length;
        int i = 0, c = 0, j;
        for(i = 0;i < n;i++)
        if(a[i].length == 1){
            System.out.println(a[i][0]);
        }else
        while (i < n) {
            for (j = i; j < n; j++)
                System.out.print(a[i][j] + " ");
            j--;
            n--;
            while (i != j) {
                i++;
                System.out.print(a[i][j] + " ");
            }
            while (j > c) {
                j--;
                System.out.print(a[i][j] + " ");
            }
            c++;
            while (i > c) {
                i--;
                System.out.print(a[i][j] + " ");
            }
            i--;
            i++;
        }
    }
}