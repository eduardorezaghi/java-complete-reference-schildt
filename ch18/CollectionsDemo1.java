package ch18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

class CollectionsDemo1 {

    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        Collection<String> list = new ArrayList<String>();

        for (String color : colors) {
            list.add(color);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("ArrayList size: " + list.size());

        list.removeIf(color -> color.equals("CYAN"));
        System.out.println("ArrayList after removeIf: " + list);
        System.out.println("ArrayList size after removeIf: " + list.size());

        list.clear();
        System.out.println("ArrayList after clear: " + list);
        System.out.println("ArrayList is empty? " + list.isEmpty());
    }
}