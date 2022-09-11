public class StringSubSequence {
    public static String[] find(String s) {
        if (s.length() == 0) {
            String str[] = { " " };
            return str;
        }
        String str[] = find(s.substring(1));

        String ans[] = new String[str.length * 2];
        int k = 0;
        for (int i = 0; i < str.length; i++) {
            ans[k] = str[i];
            k++;
        }
        for(int i = 0 ;i < str.length ; i ++){
            ans[k] = s.charAt(0) + str[i];
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "xyz";
        String ans[] = find(s);
        for (int i = 0; i < ans.length; i++)
            System.out.println(ans[i]);
    }
}
