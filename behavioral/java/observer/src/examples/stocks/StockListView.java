package examples.stocks;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private final List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        System.out.println("----------------------------------");
        for (var stock : stocks) {
            System.out.println(stock);
        }
        System.out.println("----------------------------------");
    }

    @Override
    public void update() {
        show();
    }
}
