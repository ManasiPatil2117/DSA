public class ArrayStructure2D {
    public static void main(String[] args) {
        int a[][] =  new int[][]{{1,2,3,4},{4,5,6}};
        System.out.println(a);
        // this will print the refernce that is stored in a - [[I@7ad041f3 , where [[ indicates that it is a two dimentional array, I indicates Integer and @__ indicates the address where it is stored in the memory
        System.out.println(a[0]);
        // tihs will print the refernce of 1D array 
        for(int i=0;i<2;i++)
        System.out.println(a[i]);
        System.out.println(a.length);
        System.out.println(a[0].length);
        // for more details see notes
        }
}
