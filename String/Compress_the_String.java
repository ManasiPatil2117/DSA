package String;

public class Compress_the_String {
    public static void main(String[] args) {
        String s = "aaabbcddeeeee";
        StringBuilder b = new StringBuilder();
        int  c= 1;
        for(int i  =0; i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                c++;
            }else if(c==1){
                b.append(s.charAt(i));
            }else{
                b.append(s.charAt(i));
                b.append(c);
                c=1;
            }
        }
        System.out.println(b);
    }
}
