package p2;

public class Protection2 extends p1.Protection {
    public Protection2() {
        System.out.println("derived other package constructor");

        // class or package only
        // System.out.println("n = " + n); // n has package access in Protection

        // private only
        // System.out.println("n_pri = " + n_pri); // n_pri has private access in Protection

        // class, package or subclass only
        System.out.println("n_pro = " + n_pro);
    }
}
