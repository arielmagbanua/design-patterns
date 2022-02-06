package examples.cloudStorage;

public class EncryptedCloudStream implements Stream {
    private final Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data) {
        return "09i0-i2-0940-3129840-8sdfiasdf" + data + "laksjdfli1092831dwsfs0021";
    }
}
