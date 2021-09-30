package examples.ui;

public class ArticlesDialogBox extends DialogBox {
    private final ListBox articlesListBox = new ListBox(this);
    private final TextBox titleTextBox = new TextBox(this);
    private final Button saveButton = new Button(this);

    public void selectArticle(String article){
        articlesListBox.setSelection(article);
    }

    public void setTitle(String content) {
        titleTextBox.setContent(content);
    }

    @Override
    public void changed(UIControl control) {
        if (control == articlesListBox) {
            articlesSelected();
        } else if (control == titleTextBox) {
            titleChanged();
        }
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
