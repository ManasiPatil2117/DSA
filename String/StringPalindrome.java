package String;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "MAM";
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        String s2 = buffer.toString();
        if (s.equals(s2)) {
            System.out.println("true");
        } else
            System.out.println("false");
    }

}