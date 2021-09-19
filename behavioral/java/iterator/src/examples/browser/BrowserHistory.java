package examples.browser;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private final String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

    private static class ArrayIterator implements Iterator<String> {
        private final BrowserHistory history;
        private int index;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.count;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
