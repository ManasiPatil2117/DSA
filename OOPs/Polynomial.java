/**
 * Polynomial
 */
class Poly {
    Dynamic coe;

    public Poly() {
        coe = new Dynamic();
    }

    public void setCoefficient(int c, int degree) {
        coe.add(c);
        coe.add(degree);
    }

    public int getCoefficient(int i) {
        return coe.get(i);
    }

    public void print() {
        if (coe.size() == 0) {
            System.out.println(0);
        } else {
            for (int i = 0; i < coe.size() - 1; i = i + 2) {
                System.out.print(coe.get(i) + "x^" + coe.get(i + 1) + " ");
            }
            System.out.println();
        }
    }

    public void add(Poly p2) {
        for (int i = 1; i < coe.size(); i = i + 2) {
            for (int j = 1; j < p2.coe.size(); j = j + 2) {
                if (this.coe.get(i) == p2.coe.get(j)) {
                    int t = p2.coe.get(j - 1);
                    int t2 = this.coe.get(i - 1);
                    this.coe.set((i - 1), (t + t2));
                    p2.coe.remove(j);
                    p2.coe.remove(j - 1);
                }
            }
        }
        if(!p2.coe.isEmpty()){
            for(int i = 0 ; i < p2.coe.size();i++){
                this.coe.add(p2.coe.get(i));
            }
        }
        

    }

    public void sub(Poly p2) {
        for (int i = 1; i < coe.size(); i = i + 2) {
            for (int j = 1; j < p2.coe.size(); j = j + 2) {
                if (this.coe.get(i) == p2.coe.get(j)) {
                    int t = p2.coe.get(j - 1);
                    int t2 = this.coe.get(i - 1);
                    this.coe.set((i - 1), (t - t2));
                    p2.coe.remove(j);
                    p2.coe.remove(j - 1);
                }
            }
        }
        if(!p2.coe.isEmpty()){
            for(int i = 0 ; i < p2.coe.size();i++){
                this.coe.add(p2.coe.get(i));
            }
        }
    }

}

public class Polynomial {
    public static void main(String[] args) {
        Poly p1 = new Poly();
        p1.setCoefficient(1, 2);
        p1.setCoefficient(2, 3);
        p1.setCoefficient(4, 6);
        Poly p2 = new Poly();
        // p2.setCoefficient(3, 4);
        p2.setCoefficient(3, 4);
        p2.setCoefficient(1, 2);
        // p1.print();
        // p2.print();
        // System.out.println(p1.getCoefficient(1));
        // p1.add(p2);
        // p1.sub(p2);
        p1.print();

    }

}