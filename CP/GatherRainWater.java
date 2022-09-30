package CP;
public class GatherRainWater {
    public static void main(String[] args) {
        int a[] = { 90 ,70 ,20 ,80 ,50 };
        int n = a.length;
        int secLargest=0, large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > large) {
                secLargest = large;
                large = a[i];
            }else if(a[i]>secLargest && a[i]!=large)
            {
                secLargest = a[i];
            }
        }
        System.out.println(secLargest+" "+large);
        int ans = secLargest *n,sum=0;
        for(int i =0;i<n;i++){
            if(a[i]==large){
                continue;
            }
            sum+=a[i];
        }
        sum+=secLargest;
        ans = ans-sum;
        System.out.println(ans);
    }
}
