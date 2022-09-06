public class Palindrome_2 {
    public static boolean check(String s) {
        return checkP(0, s.length(), s);
    }

    public static boolean checkP(int start, int end, String s) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end-1)) {
            return false;
        }
        return checkP(start + 1, end - 1, s);
    }

    public static void main(String[] args) {
        System.out.println(check("maddam"));
    }
}
