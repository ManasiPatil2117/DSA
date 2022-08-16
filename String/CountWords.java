package String;

public class CountWords {
    public static void main(String[] args) {
        String s = "this is a sample string";
        int c = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                c++;
            }
        }
        System.out.println(c);
    }
}