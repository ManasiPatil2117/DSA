package String;

public class Basics {
    public static void print(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "ManasiPatil";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 6));
        System.out.println(str.substring(1, 1));
        // System.out.println(str.substring(str.length(),1));
        System.out.println(str.contains("siP"));
        String str2 = "ManasiPatil";
        System.out.println(str.concat(str2));
        if (str.equals(str2)) {
            System.out.println("equals");
        } else
            System.out.println("not equals");
        print(str);
    }
}