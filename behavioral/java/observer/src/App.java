import examples.docs.pull.Chart;
import examples.docs.pull.DataSource;
import examples.docs.pull.SpreadSheet;

public class App {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);

        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}
