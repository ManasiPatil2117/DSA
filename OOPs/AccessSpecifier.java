public class AccessSpecifier {
    private int rn;
    //private- Accessible within the class only
    public String name;
    //public- Accessible within the package and outside the package
    int age;
    //default- Accessible within the package only
    protected String email;
    // protected- accessible within the class and inerited class
    public static void main(String[] args) {
        AccessSpecifier o = new AccessSpecifier();
        o.rn=10;
        o.name = "Manasi";        
        o.age = 20;
        o.email = "manasi@gmail.com";
        System.out.println(o.rn);
        System.out.println(o.name+" "+o.age+" "+ o.email);
    }
}
