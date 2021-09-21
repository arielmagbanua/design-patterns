import examples.tasks.GenerateReportTask;
import examples.tasks.TransferMoneyTasks;
import examples.windows.IntelliJWindow;
import examples.windows.SpotifyWindow;

public class App {
    public static void main(String[] args) {
        // var transfer = new TransferMoneyTasks();
        // transfer.execute();

        // var generate = new GenerateReportTask();
        // generate.execute();

        var spotifyWindow = new SpotifyWindow();
        spotifyWindow.close();

        var intelliJWindow = new IntelliJWindow();
        intelliJWindow.close();
    }
}
