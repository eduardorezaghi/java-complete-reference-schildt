package ch12;

public class BoxingDemo {
    public static void main(String[] args) {
        Integer intNonPrimitive = Integer.valueOf(10);
        int intPrimitive = intNonPrimitive.intValue();

        System.out.println("intNonPrimitive: " + intNonPrimitive);
        System.out.println("intPrimitive: " + intPrimitive);

        System.out.println("Now, let's use autoboxing and unboxing");
        Integer intNonPrimitive2 = 15; // autoboxing
        int intPrimitive2 = intNonPrimitive2; // unboxing

        System.out.println("intNonPrimitive2: " + intNonPrimitive2);
        System.out.println("intPrimitive2: " + intPrimitive2);
    }
}
