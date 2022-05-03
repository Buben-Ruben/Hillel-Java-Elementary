import java.util.Iterator;

public class MyListIterator<E> implements Iterator<E> {
    private int index = 0;
    private final E[] values;

    public MyListIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
