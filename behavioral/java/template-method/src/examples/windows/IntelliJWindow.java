package examples.windows;

public class IntelliJWindow extends Window {
    @Override
    protected void onClosing() {
        System.out.println("Saving the last edited file...");
    }

    @Override
    protected void onClosed() {
        System.out.println("Saving the reference of the last edited file...");
    }
}
