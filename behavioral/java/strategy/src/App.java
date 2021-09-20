import examples.chat.AesGcmEncryptionAlgorithm;
import examples.chat.ChatClient;
import examples.chat.DesEncryptionAlgorithm;

public class App {
    public static void main(String[] args) {
        // var imageStorage = new ImageStorage();
        // imageStorage.store("foo", new JpegCompressor(), new BlackAndWhiteFilter());
        // imageStorage.store("foo", new PngCompressor(), new BlackAndWhiteFilter());

        try {
            var client = new ChatClient();
            var aesEncryption = new AesGcmEncryptionAlgorithm();
            var desEncryption = new DesEncryptionAlgorithm();
            client.send("Hello Design Patterns!", aesEncryption);
            client.send("Hello Design Patterns!", desEncryption);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
