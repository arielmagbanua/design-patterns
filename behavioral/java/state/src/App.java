import examples.canvass.Canvas;
import examples.canvass.SelectionTool;

public class App {
    public static void main(String[] args) throws Exception {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
