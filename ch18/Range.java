package ch18;

import java.util.Iterator;

public record Range(int start, int end) implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int current = start;

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new IndexOutOfBoundsException("No more elements in the range");
                }

                return current++;
            }
        };
    }
}