public class TripletSum{
    public static void main(String args[]){
        int a[] = new int[]{ 1, 2, 3, 4, 5, 6, 7};
        int sum =12,c=0;
        for(int i =0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                for( int  k = j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==sum){
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}