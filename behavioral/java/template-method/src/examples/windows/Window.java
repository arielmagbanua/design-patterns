package examples.windows;

public abstract class Window {
    public void close() {
        onClosing();

        System.out.println("Removing the window from the screen");

        onClosed();
    }

    protected void onClosing() {}
    protected void onClosed() {}
}
