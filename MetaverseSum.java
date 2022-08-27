public class MetaverseSum {
    public static void main(String[] args) {
        int f = 0;
        int a[] = new int[] { 11,7,14,2,6 };
        int arr[] = a;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            while (arr[i] > 0) {
                int d = arr[i] % 10;
                sum += d;
                arr[i] = arr[i] / 10;
            }
            arr[i] = sum;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j != arr.length) {
                f = 0;
                if (arr[j] > arr[i]) {
                    f = 1;
                    System.out.print(a[j] + " ");
                    break;
                } else {
                    j++;
                }
            }
            if (f == 0) {
                System.out.print(-1+" ");
            }
        }
        System.out.println(-1);
    }
}
