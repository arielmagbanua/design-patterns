package examples.ui;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private final List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (var observer : eventHandlers) {
            observer.handle();
        }
    }
}
