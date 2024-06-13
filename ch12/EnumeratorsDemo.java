package ch12;

import java.util.Arrays;
import java.util.Collection;

// Implicitly extends java.lang.Enum.
enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // price of each apple

    Apple(int p) { price = p; }

    // Get the price of an apple
    public int getPrice() { return price; }
}

public class EnumeratorsDemo {
    public static void main(String[] args) {
        Apple ap;

        // Display all apples in an enum
        System.out.println("Here are all apple constants:");
        // values() returns an array of all the constants in an enum
        Collection<Apple> allApples = Arrays.asList(Apple.values());


        // iterate through the array of constants, printing the name and price of each apple
        allApples
            .stream() // Collection.stream() returns a stream of the elements in the collection
            // Multi-line lambda.
            .forEach(a -> {
                System.out.print(a + " costs " + a.getPrice() + " cents. ");
                System.out.println("Ordinal value: " + a.ordinal());
            });

        // Use valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
