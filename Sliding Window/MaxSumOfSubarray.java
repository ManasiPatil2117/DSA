public class MaxSumOfSubarray{
    public static void main(String[] args) {
        int a[] = new int[]{2,5,1,8,2};
        int n = a.length, i=0,j=0,sum=0,mx=0,k=3;
        while(j<n){
            sum = sum + a[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                mx = Math.max(mx,sum);
                sum = sum -a[i];
                i++;
                j++;
            }
        }
        System.out.println(mx);
    }
}