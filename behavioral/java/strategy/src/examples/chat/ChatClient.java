package examples.chat;

public class ChatClient {
    public void send(String message, EncryptionAlgorithm encryptionAlgorithm) {
        message = encryptionAlgorithm.encrypt(message);
        System.out.println(message);
        System.out.println("Sending the encrypted message...");
    }
}
