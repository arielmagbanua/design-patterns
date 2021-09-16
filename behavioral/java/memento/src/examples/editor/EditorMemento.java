package examples.editor;

public record EditorMemento(String content) {
    public String getContent() {
        return content;
    }
}
