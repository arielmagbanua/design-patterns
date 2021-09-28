package examples.docs.push;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable
 */
public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(int value) {
        for (var observer : observers) {
            observer.update(value);
        }
    }
}
