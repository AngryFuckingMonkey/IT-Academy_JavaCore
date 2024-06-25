package homeworks.lesson8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {

    private Object[] values;
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int size;

    public void enlargeCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity += capacity;
            Object[] tempArray = values.clone();
            values = new Object[capacity];
            for (int i = 0; i < capacity; i++) {
                values[i] = tempArray[i];
            }
        } else {
            enlargeCapacity();
        }
    }

    public void enlargeCapacity() {
        this.capacity += 10;
        Object[] tempArray = values.clone();
        values = new Object[capacity];
        for (int i = 0; i < capacity; i++) {
            values[i] = tempArray[i];
        }
    }

    public int getLastObjectIndex() {
        int lastObjectIndex = -1;
        for (int i = capacity - 1; i >= 0; i--) {
            if (values[i] != null) {
                lastObjectIndex = i;
                break;
            }
        }
        return lastObjectIndex;
    }

    @Override
    public int size() {
        for (int i = 0; i < this.capacity; i++) {
            if (values[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object value) {
        if (!isEmpty()) {
            for (Object object : values) {
                if (object.equals(value)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override
    public boolean add(T value) {
        int lastObjectIndex = getLastObjectIndex();
        if (capacity - 1 == lastObjectIndex) {
            enlargeCapacity();
        }
        values[lastObjectIndex + 1] = value;
        return true;
    }

    @Override
    public boolean add(int index, T value) {
        if (size() + 1 <= capacity && index < capacity && values[index] != null) {
            for (int i = capacity - 1; i < index; i--) {
                if (values[i - 1] == null) {
                    continue;
                }
                values[i] = values[i - 1];
            }
        }
        if (size() == capacity && index < capacity) {
            enlargeCapacity();
            for (int i = capacity - 1; i < index; i--) {
                values[i] = values[i - 1];
            }
        }
        if (index >= capacity) {
            enlargeCapacity(index + 1 - capacity);
        }
        values[index] = value;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> value) {
        for (T object : value) {
            add(object);
        }
        return true;
    }

    @Override
    public boolean remove(Object value) {
        int index = indexOf(value);
        if(indexOf(value) >= 0) {
            values[index] = null;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T get(int index) {
        return (T) values[index];
    }

    @Override
    public T remove(int index) {
        T temp = (T) values[index];
        values[index] = null;
        return temp;
    }

    @Override
    public T set(int index, T value) {
        T temp = (T) values[index];
        values[index] = value;
        return temp;
    }

    @Override
    public int indexOf(Object value) {
        for(int i = 0; i < capacity; i++) {
            if(values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(values, capacity);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for(int i = 0; i < capacity; i++) {
            values[i] = null;
        }
    }

    public MyArrayList() {
        capacity = DEFAULT_CAPACITY;
        values = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            values = new Object[capacity];
        } else {
            this.capacity = DEFAULT_CAPACITY;
            values = new Object[DEFAULT_CAPACITY];
        }
    }

    public MyArrayList(MyList<? extends T> col) {
        this.capacity = col.size();
        values = new Object[capacity];
        addAll(col);
    }

}
