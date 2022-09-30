package CP;

public class Binary_to_Decimal {
    public static int decimal(int n, int de, int base){
        if(n==0)
            return de;
        int last = n%10;
        de+=last*base;
        return decimal(n/10, de, base*2);
    }
    public static void main(String[] args) {
        System.out.println(decimal(1010101011,0,1));
    }
}