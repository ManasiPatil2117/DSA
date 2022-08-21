

/**
 * ClassAndObject
 */
public class ClassAndObject {

    String name;
    int rn;
    public static void main(String[] args) {
        ClassAndObject o = new ClassAndObject();
        System.out.println(o);
        // As object is a refernce of a class it will print the reference of the ClassAndObject reference
        o.name = "Manasi";
        o.rn = 68;
        System.out.println(o.name);
        System.out.println(o.rn);
    }
}