package p1;

public class AccessDemo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();

        System.out.println("main");
        System.out.println("n = " + ob1.n);
        // System.out.println("n_pri = " + ob1.n_pri); // n_pri has private access in Protection
        System.out.println("n_pro = " + ob1.n_pro);
        System.out.println("n_pub = " + ob1.n_pub);
        System.out.println();
        System.out.println("n = " + ob2.n);
        // System.out.println("n_pri = " + ob2.n_pri); // n_pri has private access in Protection
        System.out.println("n_pro = " + ob2.n_pro);
        System.out.println("n_pub = " + ob2.n_pub);
        System.out.println();
    }
}
