package Arrays;

public class SumOfTwoArrays {
    public static void pass(int a[], int b[], int n, int m) {
        int s = 0, c = 0, i = n - 1, j = m - 1, k = n - 1, ans = 0;
        int sum[] = new int[n];
        while (j >= 0) {
            s = a[i] + b[j] + c;
            sum[k] = s % 10;
            c = s / 10;
            j--;
            i--;
            k--;
        }
        while(i>=0){
            s = a[i] +c;
            sum[k] = s%10;
            c=s/10;
            i--;
            k--;
        }
        if (c == 1)
            ans = 10;
        for (int p = 0; p < n; p++){
            ans += sum[p];
            ans*=10;
        }
        ans = ans/10;

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int a[] = new int[] { 6, 2, 4,8 };
        int b[] = new int[] { 7, 5, 6 };
        int n = a.length;
        int m = b.length;
        if (n >= m) {
            pass(a, b, n, m);
        } else
            pass(b, a, m, n);

    }
}
