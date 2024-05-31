interface Callback {
    default void call(int param) {
        System.out.println("CallbackInterface.call(" + param + ")");
    }
}

interface AnotherCallback {
    default void call(int param) {
        System.out.println("AnotherCallbackInterface.call(" + param + ")");
    }
}

// "implements" is used to implement an interface
class Client implements Callback, AnotherCallback {
    @Override
    public void call(int param) {
        System.out.println("Client.call(" + param + ")");
    }

    public void callNonInterfaceMethod() {
        System.out.println("Client.callNonInterfaceMethod()");
    }
}



public class InterfaceDispatch {
    public static void main(String[] args) {
        Callback c = new Client(); // Polymorphism, interface dispatch
        AnotherCallback ac = new Client(); // Polymorphism, interface dispatch

        c.call(42);
        ac.call(51); // This will call AnotherCallback.call
        // ac.callNonInterfaceMethod(); // This will not compile, as ac is of type AnotherCallback
    }
}
