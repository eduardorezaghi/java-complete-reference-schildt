import java.util.logging.Logger;

public class Example2 {
    private static final Logger LOGGER = Logger.getLogger(Example2.class.getName());

    private static double getLogarithmByBase(int base, int num) {
        return (Math.log(num) / Math.log(base));
    }

    public static void main(String[] args) {
        int num;
        num = 100; // this program assigns num the value 100
        LOGGER.info(String.format("This is num: %d", num));
        num = num * 2;
        LOGGER.info(String.format("The value of num * 2 is %d", num));

        double log = getLogarithmByBase(3, 81);
        LOGGER.info(String.format("The logarithm of 81 with base 3 is %f", log));
    }
}
