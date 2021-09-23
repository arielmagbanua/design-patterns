package examples.ui.editor;

public interface UndoableCommand extends Command {
    void unExecute();
}
