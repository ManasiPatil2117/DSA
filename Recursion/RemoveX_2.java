public class RemoveX_2 {
    public static String remove(String s){
        if(s.length()==0)   
            return " ";
        String ans =" ";
        if(s.charAt(0) != 'x'){
            ans = ans + s.charAt(0);
        }
        String sm= remove(s.substring(1));
        return (ans + sm).trim();

    }
    public static void main(String[] args) {
        System.out.println(remove("xxx"));
    }
    
}
