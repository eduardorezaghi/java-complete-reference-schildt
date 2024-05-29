class A {
    int i = 10;
    int j = 20;

    public A() {
        System.out.println("A");
    }

    public void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k = 30;

    public B() {
        System.out.println("B");
    }

    // annotation to indicate that this method overrides a superclass method
    @Override 
    public void show() {
        System.out.println("k: " + k);
    }
}

public class Overriding {
    public static void main(String[] args) {
        B b = new B();
        b.show();

        // This is an example of polymorphism 
        // (a superclass reference can refer to a subclass object)
        A a = new B();
        a.show();
    }
}
