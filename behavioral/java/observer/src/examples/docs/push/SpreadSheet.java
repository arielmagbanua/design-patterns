package examples.docs.push;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("SpreadSheet got notified: " + value);
    }
}
