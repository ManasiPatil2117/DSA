public class Palindrome {
    public static boolean check(int start, int end, char[] n) {
        if (start >= end )
            return true;
        if (n[start] != n[end - 1])
            return false;
        return check(start + 1, end - 1, n);
    }

    public static void main(String[] args) {
        String s = "madam";
        char a[] = s.toCharArray();
        System.out.println(check(0, a.length, a));
    }
}
