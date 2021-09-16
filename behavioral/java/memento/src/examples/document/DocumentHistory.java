package examples.document;

import java.util.ArrayDeque;
import java.util.Deque;

public class DocumentHistory {
    private final Deque<DocumentState> mementos = new ArrayDeque<>();

    public void push(DocumentState memento) {
        mementos.push(memento);
    }

    public DocumentState pop() {
        return mementos.pop();
    }

    public DocumentState undo() {
        // remove the last item
        mementos.pop();

        return mementos.getFirst();
    }
}
