package String;

public class TEst {
    public static void main(String[] args) {
        String s = "aaabbcddeeeee";
        StringBuilder b = new StringBuilder();
        char currentChar;
        int j;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            c = 0;
            for (j = i; j < s.length(); j++) {
                if (currentChar == s.charAt(j)) {
                    c++;
                } else if (c == 0) {
                    b.append(currentChar);
                } else if (c > 1) {
                    b.append(currentChar);
                    b.append(c);
                    i = j - 1;
                    break;
                } else {
                    break;
                }

            }

        }
        System.out.println(b);
    }
}
