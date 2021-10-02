package examples.ui;

public class ArticlesDialogBox {
    private final ListBox articlesListBox = new ListBox();
    private final TextBox titleTextBox = new TextBox();
    private final Button saveButton = new Button();

    public ArticlesDialogBox() {
        articlesListBox.addEventHandler(this::articlesSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void selectArticle(String article){
        articlesListBox.setSelection(article);
    }

    public void setTitle(String content) {
        titleTextBox.setContent(content);
    }

    private void articlesSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var empty = (content == null || content.isEmpty());
        saveButton.setEnabled(!empty);
    }

    @Override
    public String toString() {
        return "ArticlesDialogBox{" +
                "articlesListBox=" + articlesListBox.getSelection() +
                ", titleTextBox=" + titleTextBox.getContent() +
                ", saveButton=" + saveButton.isEnabled() +
                '}';
    }
}
