public class FirstIndexOfEle {
    static int pos = -1;
    public static int find(int a[], int start, int ele) {
        if (start >= a.length)
            return -1;
            if (a[start] == ele)
                pos=start;
        return find(a, start + 1, ele);
    }

    public static void main(String[] args) {
        int a[] = { 9, 8 ,10 ,8 };
        find(a, 0, 8);
        System.out.println(pos);
    }
}
