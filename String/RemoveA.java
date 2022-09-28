
public class RemoveA {
    static void remove_1(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        if (c == 'a') {
            remove_1(p, up.substring(1));
        } else
            remove_1(p + c, up.substring(1));

    }

    private static String remove(String s) {
        if (s.isEmpty()) {
            return s;
        }
        char c = s.charAt(0);
        if (c == 'a') {
            return remove(s.substring(1));
        } else
            return c + remove(s.substring(1));

    }

    public static void main(String[] args) {
        String s = "abananaa";
        // remove_1(" ", s);
        System.out.print(remove(s));
    }

}
