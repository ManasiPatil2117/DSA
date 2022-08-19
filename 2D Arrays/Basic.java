import java.util.Scanner;

public class Basic {
    public static int[][] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size-");
        int row = sc.nextInt();
        System.out.println("Enter col size-");
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        System.out.println("Enter Elements-");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
    public static void print(int [][]a){
        int row =a.length;
        int col = a[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       int a[][] = createArray();
       print(a);

    }
}