package examples.windows;

public class SpotifyWindow extends Window {
    @Override
    protected void onClosing() {
        System.out.println("Stopping the currently played song...");
    }

    @Override
    protected void onClosed() {
        System.out.println("Saving the last played song...");
    }
}
