/**
 * FractionClass
 */
public class FractionClass {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(10, 30);
        f1.print();
        // f1.setNumerator(2);
        // f1.print();
        // f1.setDenom(4);
        // f1.print();
        Fraction f2 = new Fraction(3, 4);
        // f1.add(f2);
        // f1.print();
        f1.multiply(f2);
        f1.print();
    }
}

class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero");
        }
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int min = Math.min(numerator, denominator);
        int gcd = 1;
        for (int i = 2; i <= min; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public void setDenom(int denominator) {
        if (denominator == 0) {
            System.out.println("Denom cannot be zero");
        }
        this.denominator = denominator;
        simplify();
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public void add(Fraction f2) {
        this.numerator = (this.numerator * f2.denominator) + (this.denominator * f2.numerator);
        this.denominator = this.denominator * f2.denominator;
        this.simplify();
    }

    public void multiply(Fraction f2) {
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }
}