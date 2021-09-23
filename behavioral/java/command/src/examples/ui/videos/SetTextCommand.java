package examples.ui.videos;

public class SetTextCommand extends VideoEditingCommand {
    private final String text;

    public SetTextCommand(String text, VideoEditor editor, History history) {
        super(editor, history);

        this.text = text;
    }

    @Override
    public void undo() {
        editor.removeText();
    }

    @Override
    protected void run() {
        editor.setText(text);
    }
}
