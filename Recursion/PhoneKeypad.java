import java.util.ArrayList;
import java.util.Collections;

public class PhoneKeypad {
    static char numberPad[][];

    public static void generateNumChar() {
        numberPad = new char[10][5];
        numberPad[0] = new char[] { '\0' };
        numberPad[1] = new char[] { '\0' };
        numberPad[2] = new char[] { 'a', 'b', 'c' };
        numberPad[3] = new char[] { 'd', 'e', 'f' };
        numberPad[4] = new char[] { 'g', 'h', 'i' };
        numberPad[5] = new char[] { 'j', 'k', 'l' };
        numberPad[6] = new char[] { 'm', 'n', 'o' };
        numberPad[7] = new char[] { 'p', 'q', 'r', 's' };
        numberPad[8] = new char[] { 't', 'u', 'v' };
        numberPad[9] = new char[] { 'w', 'x', 'y', 'z' };
    }

    public static ArrayList<String> get(int[] n, int len, int index, String s) {
        if (index == len) {
            return new ArrayList<>(Collections.singleton(s));
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < numberPad[n[index]].length; i++) {

            String copy = s;
            copy = copy.concat(String.valueOf(numberPad[n[index]][i]));
            list.addAll(get(n, len, index + 1, copy));
        }
        return list;
    }

    public static void get(int[] n) {
        generateNumChar();
        ArrayList<String> stringList = get(n, n.length, 0, "");
        for (int i = 0; i < stringList.size(); i++)
            System.out.print(stringList.get(i) + " ");
    }

    public static void main(String[] args) {
        int[] n = { 2, 3 };
        get(n);

    }
}