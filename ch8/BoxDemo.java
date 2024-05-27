package ch8;


class Box {
    // Lombok can be used to generate getters and setters
    private double width;
    private double height;
    private double depth;

    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // This is the constructor for Box.
    Box() {
        System.out.println("Constructing Box");
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }
    
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight; // weight of box

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(BoxWeight ob) { // pass object to constructor
        super(ob); 
        // here, BoxWeight can be passed to Box constructor,
        // that means that even though BoxWeight is a "specialization" of Box,
        // it can be used as a Box object (Liskov substitution principle)
        weight = ob.weight;
    }

    // constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        // In the super() call, w, h, d are passed to the Box constructor.
        super(w, h, d);
        weight = m;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight {
    double cost;

    // constructor when all parameters are specified
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // default constructor
    Shipment() {
        super();
        cost = -1;
    }

    // constructor used when cube is created
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
    }
}
