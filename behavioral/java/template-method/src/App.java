import examples.tasks.GenerateReportTask;
import examples.tasks.TransferMoneyTasks;

public class App {
    public static void main(String[] args) {
        var transfer = new TransferMoneyTasks();
        transfer.execute();

        var generate = new GenerateReportTask();
        generate.execute();
    }
}
