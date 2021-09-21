import examples.chat.AesGcmEncryptionAlgorithm;
import examples.chat.ChatClient;
import examples.chat.DesEncryptionAlgorithm;

public class App {
    public static void main(String[] args) {
        // var imageStorage = new ImageStorage();
        // imageStorage.store("foo", new JpegCompressor(), new BlackAndWhiteFilter());
        // imageStorage.store("foo", new PngCompressor(), new BlackAndWhiteFilter());

        try {
            var aesEncryption = new AesGcmEncryptionAlgorithm();
            var desEncryption = new DesEncryptionAlgorithm();

            var client = new ChatClient(aesEncryption);
            client.send("Hello Design Patterns!");

            client.setEncrypter(desEncryption)
                .send("Hello Design Patterns!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
