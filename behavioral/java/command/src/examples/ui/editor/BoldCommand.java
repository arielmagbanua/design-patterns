package examples.ui.editor;

public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private final HtmlDocument document;
    private final History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unExecute() {
        document.setContent(prevContent);
    }
}
