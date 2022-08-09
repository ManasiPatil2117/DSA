public class PairSum{
    public static void main(String[] args) {
        int a[] = new int[]{2 ,8 ,10 ,5 ,-2 ,5};
        int c=0;
        for(int i =0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==10)
                c++;
            }
        }
        System.out.println(c);
    }
}