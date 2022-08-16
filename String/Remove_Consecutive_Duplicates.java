package String;

public class Remove_Consecutive_Duplicates {
    public static void main(String[] args) {
        String str = "aabcccbaa";
        StringBuilder s = new StringBuilder(str);
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                s.deleteCharAt(i + 1);
                i--;

            }
        }
        System.out.println(s);
    }
}
