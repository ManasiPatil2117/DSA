public class Test {

    // *
    // **
    // ***
    // ****
    public static void main(String[] args) {
        int i = 0, j;
        while (i < 4) {
            char c=(char)('A');
            j = 1;
            while (j <=4) {
                System.out.print(c);
                c= (char)(c+1);
                j++;
            }
            j = 1;
            // while (j <=4-i) {
            //     System.out.print(" ");
            //     j++;
            // }
            i++;
            System.out.println();
        }
    }
}
