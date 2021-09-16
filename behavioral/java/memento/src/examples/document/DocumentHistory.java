package examples.document;

import java.util.ArrayDeque;
import java.util.Deque;

public class DocumentHistory {
    private final Deque<DocumentMemento> mementos = new ArrayDeque<>();

    public void push(DocumentMemento memento) {
        mementos.push(memento);
    }

    public DocumentMemento pop() {
        return mementos.pop();
    }

    public DocumentMemento undo() {
        // remove the last item
        mementos.pop();

        return mementos.getFirst();
    }
}
