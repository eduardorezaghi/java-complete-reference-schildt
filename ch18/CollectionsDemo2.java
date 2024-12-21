package ch18;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        
        Collection<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        for (int i : new Range(1, 10)) {
            System.out.println("i: " + i);
        }

    }
}
