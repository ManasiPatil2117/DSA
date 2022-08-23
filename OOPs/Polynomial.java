/**
 * Polynomial
 */
class Poly {
    Dynamic coe;

    public Poly() {
        coe = new Dynamic();
    }

    public void setCoefficient(int c,int degree){
       coe.add(c);
       coe.add(degree);
    }

    public int getCoefficient(int i){
        return coe.get(i);
    }

    public int degree(){
        
    }

    public void print() {
        if (coe.size() == 0) {
            System.out.println(0);
        } else {
            for (int i = 0; i < coe.size()-1; i++) {
                System.out.print(coe.get(i) + "x^" + coe.get(i + 1));
            }
            System.out.println();
        }
    }

    public void add(Poly p2){

    }
}

public class Polynomial {
    public static void main(String[] args) {
        Poly p1 = new Poly();
        p1.setCoefficient(2, 4);
        Poly p2 = new Poly();
        p2.setCoefficient(3, 2);
        p1.print();
        p2.print();
        System.out.println(p1.getCoefficient(1));
    }

}