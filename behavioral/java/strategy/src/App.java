import examples.images.BlackAndWhiteFilter;
import examples.images.ImageStorage;
import examples.images.JpegCompressor;
import examples.images.PngCompressor;

public class App {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("foo", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("foo", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
