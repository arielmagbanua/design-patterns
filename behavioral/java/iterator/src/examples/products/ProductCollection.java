package examples.products;

import examples.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private final List<Product> products = new ArrayList<>();
    private ListIterator iterator;

    public void add(Product product) {
        products.add(product);
    }

    public Product pop() {
        int lastIndex = products.size() - 1;
        Product lastProduct = products.get(lastIndex);
        products.remove(lastIndex);

        return lastProduct;
    }

    public ListIterator getIterator() {
        if (iterator == null) {
            iterator = createIterator();
        }

        return iterator;
    }

    private ListIterator createIterator() {
        return new ListIterator(this);
    }

    public static class ListIterator implements Iterator<Product> {
        private final ProductCollection productCollection;
        private int index;

        public ListIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < productCollection.products.size();
        }

        @Override
        public Product current() {
            return productCollection.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
