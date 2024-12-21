package ch14;

class Gen<T> {
    T obj;

    Gen(T obj) {
        this.obj = obj;
    }

    T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type of T is " + obj.getClass().getName());
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Gen<Integer> integerContainer;

        integerContainer = new Gen<Integer>(88);

        integerContainer.showType();

        int value = integerContainer.getObj();
        System.out.println("value: " + value);

        System.out.println();

        Gen<String> stringContainer = new Gen<String>("Generics Test");

        stringContainer.getObj();

        String str = stringContainer.getObj();
        System.out.println("value: " + str);
    }
}