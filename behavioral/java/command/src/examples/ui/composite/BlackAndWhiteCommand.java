package examples.ui.composite;

import examples.ui.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white...");
    }
}
