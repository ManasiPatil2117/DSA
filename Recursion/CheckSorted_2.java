public class CheckSorted_2 {
    public static boolean check(int []a, int startindex){
        if(startindex >= a.length-1)
        return true;

        if(a[startindex]> a[startindex+1])
        return false;
        return check(a, startindex+1);
    }
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        System.out.println(check(a,0));
    }
}
