package examples.chat;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public abstract class EncryptionAlgorithm implements Encryptor {
    protected final KeyGenerator keyGen;

    public EncryptionAlgorithm(String encryptionAlgorithm) throws NoSuchAlgorithmException {
        this.keyGen = KeyGenerator.getInstance(encryptionAlgorithm);
    }

    protected String hex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }

    protected byte[] getRandomNonce() {
        byte[] nonce = new byte[12];
        new SecureRandom().nextBytes(nonce);
        return nonce;
    }

    protected SecretKey getKey(int keySize) throws NoSuchAlgorithmException {
        keyGen.init(keySize, SecureRandom.getInstanceStrong());
        return keyGen.generateKey();
    }
}
