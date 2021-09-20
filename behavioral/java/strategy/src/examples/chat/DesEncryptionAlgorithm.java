package examples.chat;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

public class DesEncryptionAlgorithm extends EncryptionAlgorithm {
    public DesEncryptionAlgorithm() throws NoSuchAlgorithmException {
        super("DES");
    }

    @Override
    public String encrypt(String message) {
        try {
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, getKey(56));
            byte[] encryptedText = cipher.doFinal(message.getBytes(StandardCharsets.UTF_8));

            return hex(encryptedText);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        return message;
    }
}
