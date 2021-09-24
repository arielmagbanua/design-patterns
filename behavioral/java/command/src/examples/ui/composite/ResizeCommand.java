package examples.ui.composite;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize...");
    }
}
