package examples.ui.editor;

public class HtmlDocument {
    private String content;

    public void makeBold() {
        content = String.format("<b>%s</b>", content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
