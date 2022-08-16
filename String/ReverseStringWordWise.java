package String;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        String s[] = "Welcome to Coding Ninjas".split(" ");
        String ans="";
        System.out.println(" string: " + s[0]);
        for(int i = s.length-1; i>=0;i--){
            ans+= s[i]+" ";
        }
        System.out.println(ans);
    }
}
