
public class ReplacePi {
    public static StringBuilder replace(int start, StringBuilder s) {
        if (start == s.length() - 1)
            return s;
        if (s.charAt(start) == 'p' && s.charAt(start + 1) == 'i') {
            s.deleteCharAt(start + 1);
            s.replace(start, start + 1, "3.14");
        }
        return replace(start + 1, s);
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("pip");
        System.out.println(replace(0, s));
    }
}
