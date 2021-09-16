import examples.document.Document;
import examples.document.DocumentHistory;
import examples.editor.Editor;
import examples.editor.History;

public class App {
    public static void main(String[] args) throws Exception {
         var editor = new Editor();
         var history = new History();

         // editor.setContent("a");
         // history.push(editor.createState());

         // editor.setContent("b");
         // history.push(editor.createState());

         // editor.setContent("c");
         // editor.restore(history.pop());

         // System.out.println(editor.getContent());

         var document = new Document();
         var documentHistory = new DocumentHistory();

         document.setContent("Hello World!");
         document.setFontName("Sans");
         document.setFontSize(12);
         documentHistory.push(document.createState());

         document.setContent("Hello Galaxy!");
         document.setFontName("Roboto");
         document.setFontSize(14);
         documentHistory.push(document.createState());

         document.setContent("Hello Universe!");
         document.setFontName("Roboto");
         document.setFontSize(18);

         System.out.println(document);
         document.restore(documentHistory.undo());
         System.out.println(document);
    }
}
