package examples.editor;

public record EditorState(String content) {
    public String getContent() {
        return content;
    }
}
