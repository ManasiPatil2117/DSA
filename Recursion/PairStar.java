public class PairStar {
    static String str = "";

    public static void print(int start, StringBuffer s) {
        str += s.charAt(start);
        if (start == s.length() - 1)
            return;
        if (s.charAt(start) == s.charAt(start + 1)) {
            str += "*";
        }
        print(start + 1, s);
    }

    public static void main(String[] args) throws Exception {
        StringBuffer s = new StringBuffer("aaaa");
        print(0, s);
        System.out.println(str);

    }
}
