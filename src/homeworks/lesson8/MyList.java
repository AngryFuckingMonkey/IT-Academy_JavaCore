package homeworks.lesson8;

import java.util.Collection;

public interface MyList <T> extends Collection <T> {

    int size();

    boolean isEmpty();

    boolean contains(Object value);

    boolean add(T value);

    boolean add(int index, T value);

    boolean remove(Object value);

    boolean addAll(Collection<? extends T> value);

    T get(int index);

    T remove(int index);

    T set(int index, T value);

    int indexOf(Object value);

}
