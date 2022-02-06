import examples.notifications.NotificationService;

public class App {
    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Hello World", "192.168.255.2");
    }
}
