package examples.chat;

import javax.crypto.*;
import javax.crypto.spec.GCMParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

public class AesGcmEncryptionAlgorithm extends EncryptionAlgorithm {
    public AesGcmEncryptionAlgorithm() throws NoSuchAlgorithmException {
        super("AES");
    }

    @Override
    public String encrypt(String message) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, getKey(128), new GCMParameterSpec(128, getRandomNonce()));
            byte[] encryptedText = cipher.doFinal(message.getBytes(StandardCharsets.UTF_8));

            return hex(encryptedText);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        return message;
    }
}
