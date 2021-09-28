package examples.stocks;

public class Stock extends Subject {
    private final String symbol;
    private float price;

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public String toString() {
        return String.format("Stock{symbol=%s, price=%.2f}", symbol, price);
    }
}
