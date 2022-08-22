import java.util.Scanner;

public class ComplexClass {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        c1.print();
        Complex c2 = new Complex(6, 7);
        try (Scanner sc = new Scanner(System.in)) {
            int o = sc.nextInt();
            switch (o) {
                case 1:
                    c1.add(c2);
                    c1.print();
                    break;
                case 2:
                    c1.multiply(c2);
                    c1.print();
                default:
                    break;
            }
        }
    }
}

class Complex {
    private int real, imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        System.out.println(real + " + i" + imaginary);
    }

    public void add(Complex c2) {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }

    public void multiply(Complex c2) {
        int treal = (this.real * c2.real) - (this.imaginary * c2.imaginary);
        int timaginary = (this.real * c2.imaginary) + (this.imaginary * c2.real);
        this.real = treal;
        this.imaginary = timaginary;
    }
}
