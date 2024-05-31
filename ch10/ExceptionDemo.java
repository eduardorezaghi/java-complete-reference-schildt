package ch10;

class ExcTest {
    static void genException() {
        int[] nums = new int[4];
        System.out.println("Before exception is generated.");
        nums[7] = 10;
        System.out.println("This won't be displayed.");
    }

    static void divideByZero() {
        int a = 42, b = 0;
        int c = a / b;
    }
}


public class ExceptionDemo {
    public static void main(String[] args) {
        /*
         * try/catch blocks are used to handle exceptions.
         * That prevents the program to fail catastrophically, allowing it to
         * continue running after an exception is thrown.
         */

        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // throw to the default Java exception handler
            System.out.println("Array index out-of-bounds.");
            System.out.println("\nStack trace: ");
            exc.printStackTrace();
            System.out.println();
        }
        
        try {
            ExcTest.divideByZero();
        } catch (ArithmeticException exc) {
            System.out.println("\nDivision by zero.");
            System.out.println("\nStack trace: ");
            exc.printStackTrace();
            System.out.println();
        }

        System.out.println("After try/catch blocks.");
    }
}
