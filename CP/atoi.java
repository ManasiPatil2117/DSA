package CP;
public class atoi {
    static int res = 0;
    public static int get(String s){
        if(s.length() == 0){
            return -1;
        }
        res= res*10;
        res = res + s.charAt(0);
        res = res-'0';
        get(s.substring(1));
        return res;
    }
    public static void main(String[] args) {
        int res = 0;
        String s = "123";
        // for (int i = 0; i < s.length(); i++) {
        //     res = res * 10;
        //     System.out.println(res);
        //     res = res + s.charAt(i);
        //     System.out.println(res);
        //     res = res - '0';
        //     System.out.println(res);

        // }

        // int a = 10+'a';
        // System.out.println(a);
        // System.out.println(res);

        // System.out.println(((Object) res).getClass().getSimpleName());

        int a = get(s);
        System.out.println(((Object)a).getClass().getSimpleName());
    }
}
