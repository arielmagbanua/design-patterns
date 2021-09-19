import examples.browser.BrowserHistory;

public class App {
    public static void main(String[] args) {
        var history = new BrowserHistory();
        history.push("google.com");
        history.push("twitter.com");
        history.push("linkedin.com");

        var iterator = history.createIterator();

        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
