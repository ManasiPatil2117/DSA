package Arrays;

public class ArrayIntersection{
    public static void main(String[] args) {
        int a1[]=new int[]{2, 6 ,1 ,2};
        int a2[]=new int[]{1,2,3,4,2};
        for(int i =0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    System.out.println(a1[i]);
                    break;
                }
            }
        }

    }

}