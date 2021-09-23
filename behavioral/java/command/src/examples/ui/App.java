package examples.ui;

import examples.ui.composite.BlackAndWhiteCommand;
import examples.ui.composite.CompositeCommand;
import examples.ui.composite.ResizeCommand;
import examples.ui.editor.BoldCommand;
import examples.ui.editor.HtmlDocument;
import examples.ui.videos.*;

public class App {
    public static void main(String[] args) {
        // var service = new CustomerService();
        // var command = new AddCustomerCommand(service);
        // var button = new Button(command);
        // button.click();

        // var composite = new CompositeCommand();
        // composite.add(new ResizeCommand());
        // composite.add(new BlackAndWhiteCommand());
        // composite.execute();

        // var history = new History();
        // var document = new HtmlDocument();
        // document.setContent("Hello World");

        // var boldCommand = new BoldCommand(document, history);
        // boldCommand.execute();
        // System.out.println(document.getContent());
        // var undoCommand = new UndoCommand(history);
        // undoCommand.execute();
        // System.out.println(document.getContent());

        var history = new History();
        var editor = new VideoEditor();

        var setTextCommand = new SetTextCommand("Hello Java!", editor, history);
        setTextCommand.execute();
        System.out.println(editor);
        var setContrastCommand = new SetContrastCommand(1.0f, editor, history);
        setContrastCommand.execute();
        System.out.println(editor);
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(editor);
    }
}
