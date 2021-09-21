package examples.chat;

public class ChatClient {
    private Encryptor encrypter;

    public ChatClient(Encryptor encrypter) {
        this.encrypter = encrypter;
    }

    public ChatClient setEncrypter(Encryptor encrypter) {
        this.encrypter = encrypter;
        return this;
    }

    public void send(String message) {
        message = encrypter.encrypt(message);
        System.out.println(message);
        System.out.println("Sending the encrypted message...");
    }
}
