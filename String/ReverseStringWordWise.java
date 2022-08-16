package String;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        String s = "Welcome to Coding Ninjas";
        StringBuffer s2;
        for(int i = s.length();i >= 0 ; i--){
            if(s.charAt(i) == ' '){
                s2.append(s.charAt(i,s.length()));
            }
        }
        System.out.println(s2);
    }
}
