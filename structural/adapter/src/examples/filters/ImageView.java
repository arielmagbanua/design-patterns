package examples.filters;

public class ImageView {
    private final Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void apply(Filter filter) {
        filter.apply(image);
    }
}
