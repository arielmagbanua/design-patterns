package examples.http;

public class Encrytor extends Handler {
    public Encrytor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encryption");
        return false;
    }
}
