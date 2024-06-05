package ch10;

public class ExceptionChainDemo {
    static void chain1() throws IllegalAccessException {
        try {
            chain2();
        } catch (IllegalAccessException e) {
            System.out.println("Caught: " + e + " in chain1");
            throw e;
        }
    }

    static void chain2() throws IllegalAccessException {
        try {
            chain3();
        } catch (IllegalAccessException e) {
            System.out.println("Caught: " + e + " in chain2");
            throw e;
        }
    }

    static void chain3() throws IllegalAccessException {
        System.out.println("Throwing exception in chain3");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            chain1();
        } catch (IllegalAccessException e) {
            System.out.println("Caught: " + e + " in main");
        }
        finally {
            System.out.println("Finally block in main");
        }

        System.out.println("End of program.");
    }
    
}
