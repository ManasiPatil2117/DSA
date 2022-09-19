public class Patterns {
    static void print(int i, int j){
        if(i==0)
            return;
        if(j<i){
            System.out.print("*");
            print(i, j+1);
        }else
        {
            System.out.println();
            print(i-1, j=0);
        }
    }
    public static void main(String[] args) {
        print(4,0);
    }
}
