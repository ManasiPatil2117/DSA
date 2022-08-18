package String;

public class RemoveChar {
    public static void main(String[] args) {
        String s = "Think of edge cases before submitting solutions";
        StringBuilder b = new StringBuilder(s);
        for(int i =0 ; i < b.length(); i ++){
            if(b.charAt(i)=='x'){
                b.deleteCharAt(i);
            }
            
        }
        System.out.println(b);
    }
}
