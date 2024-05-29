// Using runtime polymorphism
class Figure {
    double dimension1;
    double dimension2;

    Figure(double a, double b) {
        dimension1 = a;
        dimension2 = b;
    }

    double area() {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dimension1 * dimension2;
    }
}


public class FigureDemo {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Figure figref;

        figref = f;
        System.out.println("Area is " + figref.area());

        figref = r;
        System.out.println("Area is " + figref.area());
    }
}
