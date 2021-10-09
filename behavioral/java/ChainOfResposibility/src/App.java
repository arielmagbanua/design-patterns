import examples.http.*;
import examples.reader.ExcelReader;
import examples.reader.NumbersReader;
import examples.reader.QuickBooksReader;

public class App {
    public static void main(String[] args) {
        // authenticator -> logger -> compressor -> encryptor
        var encryptor = new Encrytor(null);
        var compressor = new Compressor(encryptor);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));

        var excelReader = new ExcelReader();
        var numbersReader = new NumbersReader();
        var reader = new QuickBooksReader();

        reader.setNext(numbersReader);
        numbersReader.setNext(excelReader);

        reader.read("data.xls");
        reader.read("data.numbers");
        reader.read("data.qbw");
        reader.read("data.jpg");
    }
}
