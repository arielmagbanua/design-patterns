package examples.ui;

import examples.ui.composite.BlackAndWhiteCommand;
import examples.ui.composite.CompositeCommand;
import examples.ui.composite.ResizeCommand;
import examples.ui.editor.BoldCommand;
import examples.ui.editor.History;
import examples.ui.editor.HtmlDocument;
import examples.ui.editor.UndoCommand;

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

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
