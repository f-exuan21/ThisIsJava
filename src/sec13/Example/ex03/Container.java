package sec13.Example.ex03;

public class Container<T, V> {
    private T key;
    private V value;

    public void set(T t, V v) {
        key = t;
        value = v;
    }

    public T getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
