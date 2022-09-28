import java.util.ArrayList;

public class SubSequenceRecursion {
    static void print(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        print(p, up.substring(1));
        print(p + c, up.substring(1));
    }

    static String print_2(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }
        char c = up.charAt(0);
        return print_2(p, up.substring(1)) + print_2(p + c, up.substring(1));
    }

    static ArrayList<String> print_3(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }
        ArrayList<String> al = new ArrayList<>();
        char c= up.charAt(0);
        al.addAll(print_3(p, up.substring(1)));
        al.addAll(print_3(p+c, up.substring(1)));
        return al;
    }

    public static void main(String[] args) {
        String s = "abc";
        // print(" ", s);
        // System.out.println(print_2(" ", s));
        System.out.println(print_3("", "abc"));

    }
}
