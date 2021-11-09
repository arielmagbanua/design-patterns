import examples.filters.CaramelFilter;
import examples.filters.Image;
import examples.filters.ImageView;
import examples.filters.amazingFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
