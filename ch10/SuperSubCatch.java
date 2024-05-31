package ch10;

public class SuperSubCatch {
    /*
     * This code will not compile.
     * The reason is that the catch for ArithmeticException
     * is a subclass of the catch for Exception. 
     * Since the catch for Exception is more general,
     * it will catch all exceptions, including ArithmeticException.
     * This means that the catch for ArithmeticException will never be reached.
     */

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Generic exception catch.");
        }
        // This catch is never reached
        // catch (ArithmeticException e) {
        //     System.out.println("This is never reached.");
        // }
    }
}