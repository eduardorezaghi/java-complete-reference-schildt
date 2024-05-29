class A {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B extends A {
    // override callme
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C extends A {
    // override callme
    void callme() {
        System.out.println("Inside C's callme method");
    }
}

class D extends A {
    // override callme
    void callme() {
        System.out.println("Inside D's callme method");
    }
}



public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        A r; // obtain a reference of type A
        
        r = a; // r refers to an A object
        r.callme(); // calls A's version of callme
        
        r = b; // r refers to a B object
        r.callme(); // calls B's version of callme
        
        r = c; // r refers to a C object
        r.callme(); // calls C's version of callme
        
        r = d; // r refers to a D object
        r.callme(); // calls D's version of callme
    }
}

