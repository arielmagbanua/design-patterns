package examples.ui.videos;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private final Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        commands.push(command);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }
}
