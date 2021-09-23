package examples.ui.composite;

import examples.ui.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize...");
    }
}
