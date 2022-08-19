public class ColWithLargestSum {
    public static void main(String[] args) {
        int a[][]= new int[][]{{1,2,3},{1,2,5},{2,3,5}};
        int m=0,s;
        for(int j =0; j<a[0].length;j++){
            s=0;
            for(int i = 0 ; i < a.length;i++){
                s+=a[i][j];
            }
            if(s>m)
            m=s;
        }
        System.out.println(m);
    }   
}
