package String;

public class AllSubstrings {
    public static void main(String[] args) {
        String s = "xyz";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++)
                System.out.println(s.substring(i, j));
        }
    }
}
