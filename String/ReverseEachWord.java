package String;

/**
 * ReverseEachWord
 */
public class ReverseEachWord {

    public static void main(String[] args) {
        String s[] = "Welcome to Coding Ninjas".split(" ");
        String r="";
        for(int i = 0 ; i < s.length ; i++){
            StringBuilder b = new StringBuilder(s[i]);
            b.reverse();
            r+= b.toString()+" ";
        }
        System.out.println(r);
        
    }
}