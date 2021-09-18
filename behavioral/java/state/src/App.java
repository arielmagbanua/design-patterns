import examples.canvass.Canvas;
import examples.canvass.SelectionTool;
import examples.directions.Bicycling;
import examples.directions.DirectionService;
import examples.directions.Driving;
import examples.directions.Transit;

public class App {
    public static void main(String[] args) throws Exception {
        // var canvas = new Canvas();
        // canvas.setCurrentTool(new SelectionTool());
        // canvas.mouseDown();
        // canvas.mouseUp();

        var directionService = new DirectionService();

        directionService.setTravelMode(new Driving());
        var direction = directionService.getDirection();
        var eta = directionService.getEta();

        directionService.setTravelMode(new Bicycling());
        direction = directionService.getDirection();
        eta = directionService.getEta();

        directionService.setTravelMode(new Transit());
        direction = directionService.getDirection();
        eta = directionService.getEta();
    }
}
