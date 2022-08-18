package String;

public class Highest_Occurring_Character {
    public static void main(String[] args) {
        String s = "xy";
        int temp = 0, mx = 0, c = 0, i;
        for (i = 0; i < s.length(); i++) {
            c = 0;
            for (int j = i+1; j < s.length()-1 ; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    c++;
                }
                if (c > temp) {
                    temp = c;
                    mx = i;
                }
                else if(c==temp){
                    
                }
            }
        }
        System.out.println(s.charAt(mx));
    }
}
