package examples.gui;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private final List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (var handler : eventHandlers) {
            handler.handle();
        }
    }
}
