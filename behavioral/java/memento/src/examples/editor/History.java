package examples.editor;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EditorMemento> states = new ArrayList<>();

    public void push(EditorMemento memento) {
        states.add(memento);
    }

    public EditorMemento pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
