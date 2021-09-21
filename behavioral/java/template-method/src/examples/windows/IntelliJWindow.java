package examples.windows;

public class IntelliJWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Saving the last edited file...");
    }

    @Override
    protected void afterClose() {
        System.out.println("Saving the reference of the last edited file...");
    }
}
