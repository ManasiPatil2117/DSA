import java.util.*;
public class ContinuousSum{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int su;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(-1);
        for(int i =0;i<n;i++){
            su=arr[i];
            for(int j=i+1;j<n;j++){
                su+=arr[j];
                if(su==s){
                    al.remove(0);
                    al.add(i);
                    al.add(j);
                    return al;
                }
            }
        }
        return al;
    }
    public static void main(String args[]){
        int a[] = new int[]{1,2,3,7,5};
        int sum =12,s,c=0;
        // for(int i =0;i<a.length;i++){
        //     s=a[i];
        //     for(int j =i+1;j<a.length;j++){
        //         s+=a[j];
        //         if(s==sum){
        //             System.out.println(i+" " +j);
                    
        //         }
        //     }
        // }
                    System.out.println(subarraySum(a,5,12));

         
    }
}