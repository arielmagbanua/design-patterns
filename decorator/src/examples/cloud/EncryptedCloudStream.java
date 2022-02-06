package examples.cloud;

public class EncryptedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        super.write(encrypted);
    }

    private String encrypt(String data) {
        return "09i0-i2-0940-3129840-8sdfiasdf" + data + "laksjdfli1092831dwsfs0021";
    }
}
