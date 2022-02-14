import java.util.concurrent.ConcurrentMap;

public class MainTest {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Command command = new Command();
        command.setCommand(" C 100 50 ");

        ShapeDrawing create = new CanvasCreat();
        create.draw(canvas, command);

//        Command commandLine = new Command("L 1 2 6 2");
//        ShapeDrawing line = new Line();
//        line.draw(canvas, commandLine);
//        command.setCommand("L 6 3 6 4");
//        line.draw(canvas, command);
//        line.show(canvas);
//
//        Command commandSquares = new Command("R 14 1 18 3");
//        ShapeDrawing square = new Squares();
//        square.draw(canvas, commandSquares);

        command.setCommand("B 50 25 c");
        ShapeDrawing color = new Color();
        color.draw(canvas, command);

    }
}
