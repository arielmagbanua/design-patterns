package examples.notifications;

public class NotificationService {
    public void send(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect("192.168.255.1");
        var authToken = server.authenticate("1223344", "239849012sdf");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
