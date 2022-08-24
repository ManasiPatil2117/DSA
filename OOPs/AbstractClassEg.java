
 abstract class A {
    abstract void m1();

    A() {
        System.out.println("Red");
    }

    static void m2() {
        System.out.println("Orange");
    }
}

 class B extends A {
    void m1() {
        A.m2();
        System.out.println("Pink");
    }
}

 class C extends B {
    void m3() {
        System.out.println("Green");
    }
}

public class AbstractClassEg {
    public static void main(String[] args) {
        C c = new C();
        c.m3();
        c.m1();
    }
}