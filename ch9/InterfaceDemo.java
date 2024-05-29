package ch9;

@FunctionalInterface
interface SayHello {
    void sayHello();
}

interface Car {
    final int MAX_SPEED = 100;
    final int MIN_DOORS = 2;
    final int MAX_DOORS = 5;

    void drive();
    void stop();
}

@FunctionalInterface
interface EletricCar {
    void charge();
}

class Sedan implements Car, EletricCar {
    private int doors;

    public Sedan(int doors) {
        if (doors < MIN_DOORS || doors > MAX_DOORS) {
            throw new IllegalArgumentException("Invalid number of doors");
        }
        this.doors = doors;
    }

    @Override
    public void drive() {
        System.out.println("Sedan is driving");
    }

    @Override
    public void stop() {
        System.out.println("Sedan is stopping");
    }

    @Override
    public void charge() {
        System.out.println("Sedan is charging");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Car car = new Sedan(4); // Polymorphism
        Sedan sedan = new Sedan(4);

        // Lambda function/expression
        SayHello sayHello = () -> System.out.println("Initializing car...");
        sayHello.sayHello();

        car.drive();
        car.stop();

        sedan.drive();
        sedan.stop();
    }
}
