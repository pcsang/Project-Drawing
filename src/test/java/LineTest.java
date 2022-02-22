import org.junit.Assert;
import org.junit.Test;

public class LineTest {
    ShapeDrawing line = new Line();
    Canvas canvas = new Canvas(4,20);

    @Test
    public void drawTest(){
        Command command = new Command("L 1 2 6 2");
        canvas.create();
        line.draw(canvas, command);
        String canvasString = arrayToString(canvas);
        final String result =                   "----------------------\n" +
                                                "|                    |\n"+
                                                "|xxxxxx              |\n"+
                                                "|                    |\n"+
                                                "|                    |\n"+
                                                "----------------------\n";
        Assert.assertEquals(result, canvasString);
    }

    @Test
    public void drawTestFalse(){
        Command command = new Command("L 1 2 6 2");
        canvas.create();
        line.draw(canvas, command);
        String canvasString = arrayToString(canvas);
        final String result = new String("----------------------\n" +
                                                "|                    |\n"+
                                                "|xxxxxxx             |\n"+
                                                "|                    |\n"+
                                                "|                    |\n"+
                                                "----------------------\n");
        Assert.assertNotEquals(result, canvasString);
    }

    public String arrayToString(Canvas canvas){
        StringBuilder arrayString = new StringBuilder();
        char[][] acanvas = canvas.getCanvas();
        for (int i=0; i<canvas.getHeight()+2; i++){
            for(int j=0; j<canvas.getWidth()+2; j++){
                arrayString.append(acanvas[i][j]);
            }
            arrayString.append("\n");
        }
        return arrayString.toString();
    }
}
