import examples.cloudStorage.CloudStream;
import examples.cloudStorage.CompressedCloudStream;
import examples.cloudStorage.EncryptedCloudStream;
import examples.cloudStorage.Stream;

public class App {
    public static void main(String[] args) {
        storeCreditCard(new CompressedCloudStream(new EncryptedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard (Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
