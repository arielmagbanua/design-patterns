package examples.http;

public abstract class Handler {
    private final Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request) {
        if (doHandle(request)) {
            return;
        }

        if (next != null) {
            next.handle(request);
        }
    }

    public abstract boolean doHandle(HttpRequest request);
}
