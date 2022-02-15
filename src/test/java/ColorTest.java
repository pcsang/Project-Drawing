import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

public class ColorTest extends LineTest {
    @Test
    public void drawTest(){
        canvas.create();
        Command command = new Command();
        command.setCommand("L 1 2 6 2");
        ShapeDrawing line = new Line();
        line.draw(canvas, command);
        command.setCommand("L 6 3 6 4");
        line.draw(canvas, command);

        command.setCommand("R 14 1 18 3");
        ShapeDrawing square = new Squares();
        square.draw(canvas, command);

        command.setCommand("B 10 3 c");
        ShapeDrawing backgroundColor = new Color();
        backgroundColor.draw(canvas, command);

         final String aCanvas = super.arrayToString(canvas);
         final String result =   "----------------------\n" +
                                 "|cccccccccccccxxxxxcc|\n"+
                                 "|xxxxxxcccccccx   xcc|\n"+
                                 "|     xcccccccxxxxxcc|\n"+
                                 "|     xcccccccccccccc|\n"+
                                 "----------------------\n";
        Assert.assertEquals(aCanvas, result);
    }

    @Test
    public void drawTestFull(){
        canvas.create();
        Command command = new Command(" B 10 2 c");
        ShapeDrawing backgroundColor = new Color();
        backgroundColor.draw(canvas, command);
        final String aCanvas = super.arrayToString(canvas);
        final String result =   "----------------------\n" +
                                "|cccccccccccccccccccc|\n"+
                                "|cccccccccccccccccccc|\n"+
                                "|cccccccccccccccccccc|\n"+
                                "|cccccccccccccccccccc|\n"+
                                "----------------------\n";

        Assert.assertEquals(aCanvas, result);
    }
    @Test
    public void drawTestInSquare(){
        canvas.create();
        Command command = new Command();
        command.setCommand("R 14 1 18 3");
        ShapeDrawing square = new Squares();
        square.draw(canvas, command);

        command.setCommand("B 15 2 c");
        ShapeDrawing backgroundColor = new Color();
        backgroundColor.draw(canvas, command);

        final String aCanvas = super.arrayToString(canvas);
        final String result =   "----------------------\n" +
                                "|             xxxxx  |\n"+
                                "|             xcccx  |\n"+
                                "|             xxxxx  |\n"+
                                "|                    |\n"+
                                "----------------------\n";
        Assert.assertEquals(aCanvas, result);
    }

}
