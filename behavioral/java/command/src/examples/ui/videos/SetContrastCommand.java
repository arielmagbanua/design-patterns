package examples.ui.videos;

public class SetContrastCommand extends VideoEditingCommand {
    private final float prevContrast;
    private final float contrast;

    public SetContrastCommand(float contrast, VideoEditor editor, History history) {
        super(editor, history);

        prevContrast = editor.getContrast();
        this.contrast = contrast;
    }

    @Override
    public void undo() {
        editor.setContrast(prevContrast);
    }

    @Override
    protected void run() {
        editor.setContrast(contrast);
    }
}
