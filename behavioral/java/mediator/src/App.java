import examples.gui.SignUpDialogBox;
import examples.ui.ArticlesDialogBox;

public class App {
    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();

        dialog.selectArticle("Article 1");
        System.out.println(dialog);

        dialog.setTitle("Hello Article!");
        System.out.println(dialog);

        dialog.setTitle("");
        System.out.println(dialog);

        var signUpDialog = new SignUpDialogBox();
        signUpDialog.setUsername("foo");
        signUpDialog.setPassword("lsdkfjloajsr134189023");
        signUpDialog.toggleTerms();
    }
}
