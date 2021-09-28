import examples.docs.pull.Chart;
import examples.docs.pull.DataSource;
import examples.docs.pull.SpreadSheet;
import examples.stocks.StatusBar;
import examples.stocks.Stock;
import examples.stocks.StockListView;

public class App {
    public static void main(String[] args) {
        // var dataSource = new DataSource();
        // var sheet1 = new SpreadSheet(dataSource);
        // var sheet2 = new SpreadSheet(dataSource);

        // var chart = new Chart(dataSource);

        // dataSource.addObserver(sheet1);
        // dataSource.addObserver(sheet2);
        // dataSource.addObserver(chart);

        // dataSource.setValue(1);

        var appleStock = new Stock("APPLE", 105.5f);
        var googleStock = new Stock("GOOGLE", 115.5f);
        var amazonStock = new Stock("AMAZON", 125.5f);

        var statusBar = new StatusBar();
        var stockList = new StockListView();

        // load the stocks
        statusBar.addStock(appleStock);
        statusBar.addStock(googleStock);
        statusBar.addStock(amazonStock);
        stockList.addStock(appleStock);
        stockList.addStock(googleStock);
        stockList.addStock(amazonStock);

        appleStock.setPrice(333.33f);
        googleStock.setPrice(444.44f);
        amazonStock.setPrice(555.55f);
    }
}
