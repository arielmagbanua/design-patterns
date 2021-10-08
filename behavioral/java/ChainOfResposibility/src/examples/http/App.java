package examples.http;

public class App {
    public static void main(String[] args) {
        // authenticator -> logger -> compressor -> encryptor
        var encryptor = new Encrytor(null);
        var compressor = new Compressor(encryptor);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
    }
}
