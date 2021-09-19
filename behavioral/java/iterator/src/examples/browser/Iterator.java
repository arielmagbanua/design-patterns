package examples.browser;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
