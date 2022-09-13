import java.util.ArrayList;
import java.util.Collections;

public class StringSubsequence_2 {
    public static ArrayList<String> print(String s) {
        if (s.length() == 0) {
            return new ArrayList<>(Collections.singleton(s));
        }
        ArrayList<String> small = print(s.substring(1));
        ArrayList<String> list = new ArrayList<>();
        for (String i : small)
            list.add(i);
        for (String i : small) {
            list.add(s.charAt(0) + i);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> s = print("xyz");
        for (String i : s)
            System.out.println(i);
    }
}
