import examples.browser.BrowserHistory;
import examples.products.Product;
import examples.products.ProductCollection;

public class App {
    public static void main(String[] args) {
//        var history = new BrowserHistory();
//        history.push("google.com");
//        history.push("twitter.com");
//        history.push("linkedin.com");
//
//        var iterator = history.createIterator();
//
//        while (iterator.hasNext()) {
//            var url = iterator.current();
//            System.out.println(url);
//            iterator.next();
//        }

        var collection = new ProductCollection();
        collection.add(new Product(123, "foo"));
        collection.add(new Product(124, "bar"));
        collection.add(new Product(125, "fizz"));
        collection.add(new Product(126, "buzz"));

        var iterator = collection.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
