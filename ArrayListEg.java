/**
 * ArrayListEg
 */
import java.util.*;
public class ArrayListEg {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1,50);
        for(int e : al){
            System.out.print(e +" ");
        }
        System.out.println();
        al.remove(1);
        al.set(2,50);
        for(int i =0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        ArrayList<String> as =  new ArrayList<>();
        as.add("Manasi");
        as.add("Patil");
        as.removeIf(a->(a=="Patil"));
        for(String s : as)
        System.out.println(s);
    }
}