import java.util.logging.Logger;

public class OverloadDemo {
    public void test() {
        Logger.getGlobal().info("No parameters");
    }

    // Overload test for one integer parameter.
    public void test(int a) {
        Logger.getGlobal().info("a: " + a);
    }

    // Overload test for two integer parameters.
    public void test(int a, int b) {
        Logger.getGlobal().info("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter
    public void test(double a) {
        Logger.getGlobal().info("double a: " + a);
    }
}

