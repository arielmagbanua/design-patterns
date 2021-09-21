package examples.windows;

public class SpotifyWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Stopping the currently played music...");
    }

    @Override
    protected void afterClose() {
        System.out.println("Saving the last played music...");
    }
}
