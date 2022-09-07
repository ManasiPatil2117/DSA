public class RemoveX {
    public static StringBuilder remove(int start, StringBuilder s) {
        if (start == s.length())
            return s;
        if (s.charAt(start) == 'x') {
            s.deleteCharAt(start);
            start = start - 1;
        }
        return remove(start + 1, s);
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("xx");
        System.out.println(remove(0, s));
    }
}
