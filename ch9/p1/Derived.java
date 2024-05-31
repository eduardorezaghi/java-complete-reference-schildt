package p1;

public class Derived extends Protection {
    Derived() {
        Protection p = new Protection();

        System.out.println("Derived constructor");
        System.out.println("n = " + p.n);
        // System.out.println("n_pri = " + p.n_pri); // n_pri has private access in Protection
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
