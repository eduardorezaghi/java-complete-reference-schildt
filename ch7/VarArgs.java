public class VarArgs {
    static void vaTest(int ... v) {
        System.out.print("Number of args: " + v.length + " Contents: ");
        
        for (int x : v) {
            System.out.print(x + " ");
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        // Notice how we can pass an array to a method
        vaTest(10); // 1 arg
        vaTest(1, 2, 3); // 3 args
        vaTest(); // 0 args
    }
}
