import java.util.ArrayList;

public class AllIndex {
    static ArrayList<Integer> ar = new ArrayList<>();
    static int i =0;
    public static void find(int a[],int start,int ele){
        if(start >=a.length)
        return;
        if(a[start] == ele){
            ar.add(start);
        }
        find(a, start+1, ele);

    }
    public static void main(String[] args) {
        int a[] = {9,8,10,8,8};
        find(a,0,8);
        for(int e : ar){
            System.out.print(e+" ");
        }
        
    }
}
