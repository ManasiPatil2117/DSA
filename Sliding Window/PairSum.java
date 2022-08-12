

public class PairSum {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,4,5,6};
        int i = 0,j=0,s=0,k=3;
        while(j<a.length){
            s = s+ a[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                s= s - a[i];
                i++;
                j++;
            }
            System.out.println(s);
        }
    }
}
