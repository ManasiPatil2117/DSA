public class BinarySearch {
    public static int search(int[] a,int ele){
        int start = 0, end= a.length-1,mid=0;
        while(start<=end){
            mid = (start + end) /2;
            if(ele == a[mid]){
                return mid;
            }else if(ele > mid){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a= new int[]{1,2,3,4,6};
        System.out.println(search(a,4));
    }
}
