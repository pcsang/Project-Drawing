import org.junit.Assert;
import org.junit.Test;

public class SquaresTest extends LineTest{

    @Test
    public void DrawTest(){
        Canvas canvas = new Canvas(4, 20);
        canvas.create();
        ShapeDrawing square = new Squares();
        Command command = new Command("R 14 1 18 3");
        square.draw(canvas, command);
        final String  acanvas = super.arrayToString(canvas);
        final String result =   "----------------------\n" +
                                "|             xxxxx  |\n"+
                                "|             x   x  |\n"+
                                "|             xxxxx  |\n"+
                                "|                    |\n"+
                                "----------------------\n";
        Assert.assertEquals(result, acanvas);
    }

}
