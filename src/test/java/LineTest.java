public class LineTest {
    public String arrayToString(Canvas canvas){
        char[][] array = canvas.getCanvas();
        String canvasString = new String(array.toString());
        return canvasString;
    }
}
