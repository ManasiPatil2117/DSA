public class RowWithLargestSum {
    public static void main(String[] args) {
        int a[][] = new int[][]{{1,2,3,6},{1,2,4},{2,3,5}};
        int s=0,m=0;
        for(int i = 0;i<a.length;i++){
            s=0;
            for(int j =0;j<a[i].length;j++){
                s+=a[i][j];
            }
            if(s>m){
                m=s;
            }
        }
        System.out.println(m);
    }
}
