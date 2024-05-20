public class VarArgs2 {
    static void vaTest(String message, int ... v) {
        System.out.print(message + v.length + " Contents: ");
        
        for (int x : v) {
            System.out.print(x + " ");
        }
        
        System.out.println();
    }

    static void vaTest(boolean ...argv) {
        System.out.print("vaTest(boolean ...): " + "Number of args: " + argv.length + " Contents: ");

        for (boolean x : argv) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    static void vaTest(int ...argv) {
        System.out.print("vaTest(int ...): " + "Number of args: " + argv.length + " Contents: ");

        for (int x : argv) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    static void vaTest(String message) {
        System.out.print(message + "No args\n");
    }

    public static void main(String[] args) {
        // Notice how we can pass an array to a method
        vaTest(1,2,3); // 3 args
        vaTest(true, false, false); // 3 args
        vaTest("Testing: ", 10, 20); // 2 args
    }
}
