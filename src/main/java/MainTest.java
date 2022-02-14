import java.util.concurrent.ConcurrentMap;

public class MainTest {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Command command = new Command();
        command.setCommand(" C 20 4  ");

        ShapeDrawing creat = new CanvasCreat();
        creat.draw(canvas, command);

        Command commandLine = new Command("L 1 2 6 2");
        ShapeDrawing line = new Line();
        line.draw(canvas, commandLine);

        Command commandSquares = new Command("R 14 1 18 3");
        ShapeDrawing square = new Squares();
        square.draw(canvas, commandSquares);
    }
}
