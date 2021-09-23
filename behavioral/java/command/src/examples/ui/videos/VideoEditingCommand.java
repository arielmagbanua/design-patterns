package examples.ui.videos;

public abstract class VideoEditingCommand implements UndoableCommand {
    protected VideoEditor editor;
    protected History history;

    public VideoEditingCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute() {
        run();

        history.push(this);
    }

    protected abstract void run();
}
